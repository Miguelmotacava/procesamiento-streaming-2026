package `edu.comillas.sparkscalatest`

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.streaming.Trigger

object SparkScalaTest extends App {

  // Crear SparkSession
  val spark = SparkSession
    .builder()
    .appName("SparkScalaTest")
    .master("local[*]")
    .config("spark.sql.shuffle.partitions", 8)
    .getOrCreate()

  spark.sparkContext.setLogLevel("WARN")

  import spark.implicits._

  // Configuración de Kafka
  val kafkaBootstrapServers = "master01.bigdata.alumnos.upcont.es:29092"
  val kafkaTopic = "air_traffic"

  val aircraftDatabase = spark.read.option("header", "true").csv("src/main/resources/example.csv")

  aircraftDatabase.show(false)

  // Leer datos del topic de Kafka
  val kafkaDF = spark.readStream
    .format("kafka")
    .option("kafka.bootstrap.servers", kafkaBootstrapServers)
    .option("subscribe", kafkaTopic)
    .option("startingOffsets", "earliest")
    .option(("maxOffsetsPerTrigger"), "1000")
    .load()

  // Convertir el valor de Kafka (bytes) a String
  val messagesDF = kafkaDF
    .selectExpr(
      "CAST(key AS STRING)",
      "CAST(value AS STRING)",
      "topic",
      "partition",
      "offset",
      "timestamp"
    )

  // Mostrar los datos por consola
  val query = messagesDF.writeStream
    .outputMode("append")
    .format("console")
    .option("truncate", "false")
    .trigger(Trigger.ProcessingTime("5 seconds"))
    .start()


  query.awaitTermination()

}
