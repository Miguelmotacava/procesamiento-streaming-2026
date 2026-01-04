package `edu.comillas`.scalaintro

object ScalaIntro extends App {
var nombre: String = "mario" //variable
val edad: Int = 33 //"constante" no permite reasignar valor

println(s"Hola, me llamo $nombre y tengo $edad años.")

nombre = "carlos"  

println(s"Hola, me llamo $nombre y tengo $edad años.")
}
