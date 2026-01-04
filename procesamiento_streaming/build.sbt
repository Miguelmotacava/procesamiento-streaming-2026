import Dependencies._

ThisBuild / scalaVersion     := "2.12.18"
ThisBuild / version          := "1.0.0"
ThisBuild / organization     := "edu.comillas.icai"
ThisBuild / organizationName := "edu.comillas.icai"

val sparkVersion = "3.5.7"

lazy val root = (project in file("."))
  .settings(
    name := "procesamiento_streaming",
    libraryDependencies ++= Seq(
      "org.apache.spark" %% "spark-core" % sparkVersion,
      "org.apache.spark" %% "spark-sql" % sparkVersion,
      "org.apache.spark" %% "spark-streaming" % sparkVersion,
      "org.apache.spark" %% "spark-sql-kafka-0-10" % sparkVersion,
      munit % Test
    ),
    javaOptions ++= Seq(
      "--add-opens=java.base/sun.nio.ch=ALL-UNNAMED",
      "--add-opens=java.base/java.nio=ALL-UNNAMED"
    )
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
