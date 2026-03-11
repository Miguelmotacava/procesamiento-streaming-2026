package edu.comillas.scalaintro

/**
 * ============================================================================
 * CURSO PRÁCTICO DE SCALA - EJERCICIOS PARA ALUMNOS
 * ============================================================================
 * 
 * Este archivo contiene ejercicios prácticos para aprender los fundamentos
 * de Scala que serán necesarios para trabajar con Spark Structured Streaming.
 * 
 * Instrucciones:
 * - Completa cada sección siguiendo las indicaciones en los comentarios
 * - Los lugares donde debes escribir código están marcados con: ???
 * - Ejecuta el programa para verificar tus soluciones
 * 
 * Temas cubiertos:
 * 1. Variables (var) vs Valores (val)
 * 2. Colecciones inmutables
 * 3. Colecciones mutables
 * 4. Tuplas
 * 5. Funciones
 * 6. Funciones de orden superior
 * 7. Control de flujo
 * 8. Pattern Matching
 * 9. Ejercicio final: Transformación de datos
 * 
 * ============================================================================
 */

object ScalaIntroEjerciciosAlumnos extends App {

  println("=" * 60)
  println("CURSO PRÁCTICO DE SCALA - EJERCICIOS PARA ALUMNOS")
  println("=" * 60)

  // ==========================================================================
  // SECCIÓN 1: VARIABLES (var) VS VALORES (val)
  // ==========================================================================
  println("\n--- SECCIÓN 1: var vs val ---")

  // EJERCICIO 1.1: Declara un val llamado 'nombreInmutable' de tipo String con valor "Ana"
  val nombreInmutable: String = "Ana"

  // EJERCICIO 1.2: Declara un val llamado 'edadInmutable' de tipo Int con valor 25
  val edadInmutable: Int = 25

  // EJERCICIO 1.3: Declara un var llamado 'contador' de tipo Int con valor inicial 0
  var contador: Int = 0

  // EJERCICIO 1.4: Incrementa el contador en 1 y muestra el resultado
  contador = contador + 1
  println(s"Contador después de incrementar: $contador")

  // EJERCICIO 1.5: Declara una variable usando inferencia de tipos (sin especificar el tipo)
  // val inferido = ???

  // ==========================================================================
  // SECCIÓN 2: COLECCIONES INMUTABLES
  // ==========================================================================
  println("\n--- SECCIÓN 2: COLECCIONES INMUTABLES ---")

  // EJERCICIO 2.1: Crea una List[Int] con los números del 1 al 5
  // val listaNumeros: List[Int] = ???

  // EJERCICIO 2.2: Obtén el primer elemento de la lista usando .head
  // println(s"Primer elemento: ???")

  // EJERCICIO 2.3: Obtén el resto de elementos usando .tail
  // println(s"Resto de elementos: ???")

  // EJERCICIO 2.4: Agrega el número 0 al inicio de la lista usando ::
  // val listaExtendida = ???

  // EJERCICIO 2.5: Crea un Set[Int] con números 1, 2, 3, 2, 1 y observa cómo elimina duplicados
  // val conjuntoNumeros: Set[Int] = ???
  // println(s"Set (sin duplicados): $conjuntoNumeros")

  // EJERCICIO 2.6: Crea un Map[String, Int] con pares nombre->edad
  // val mapaEdades: Map[String, Int] = ???

  // EJERCICIO 2.7: Accede a un valor del mapa usando getOrElse
  // println(s"Edad de Luis (con getOrElse): ???")

  // EJERCICIO 2.8: Crea un rango del 1 al 10 usando 'to'
  // val rango = ???

  // ==========================================================================
  // SECCIÓN 3: COLECCIONES MUTABLES
  // ==========================================================================
  println("\n--- SECCIÓN 3: COLECCIONES MUTABLES ---")

  import scala.collection.mutable

  // EJERCICIO 3.1: Crea un ArrayBuffer mutable con los números 1, 2, 3
  // val bufferNumeros: mutable.ArrayBuffer[Int] = ???

  // EJERCICIO 3.2: Agrega el número 4 al ArrayBuffer usando +=
  // bufferNumeros += ???

  // EJERCICIO 3.3: Elimina el número 1 del ArrayBuffer usando -=
  // bufferNumeros -= ???

  // EJERCICIO 3.4: Crea un mutable.Map y agrega un nuevo par clave-valor
  // val mapaMutable: mutable.Map[String, Int] = ???
  // mapaMutable("nuevo") = ???

  // ==========================================================================
  // SECCIÓN 4: TUPLAS
  // ==========================================================================
  println("\n--- SECCIÓN 4: TUPLAS ---")

  // EJERCICIO 4.1: Crea una tupla de 2 elementos (String, Int) para nombre y edad
  // val tupla2: (String, Int) = ???

  // EJERCICIO 4.2: Accede al primer y segundo elemento de la tupla usando _1 y _2
  // println(s"Nombre: ???, Edad: ???")

  // EJERCICIO 4.3: Crea una tupla de 3 elementos con diferentes tipos
  // val tupla3: (String, Int, Boolean) = ???

  // EJERCICIO 4.4: Usa desestructuración para extraer los elementos de tupla2
  // val (nombre, edad) = ???

  // EJERCICIO 4.5: Crea una lista de tuplas (String, Int) para representar personas
  // val listaPersonas: List[(String, Int)] = ???

  // ==========================================================================
  // SECCIÓN 5: FUNCIONES
  // ==========================================================================
  println("\n--- SECCIÓN 5: FUNCIONES ---")

  // EJERCICIO 5.1: Define una función 'sumar' que reciba dos Int y devuelva su suma
  // def sumar(a: Int, b: Int): Int = ???

  // EJERCICIO 5.2: Define una función 'multiplicar' en una sola línea
  // def multiplicar(a: Int, b: Int): Int = ???

  // EJERCICIO 5.3: Define una función con parámetro por defecto
  // def saludar(nombre: String = "Mundo"): String = ???

  // EJERCICIO 5.4: Crea una función anónima (lambda) que calcule el cuadrado
  // val cuadrado: Int => Int = ???

  // EJERCICIO 5.5: Crea una función anónima usando la sintaxis abreviada con _
  // val doble: Int => Int = ???

  // ==========================================================================
  // SECCIÓN 6: FUNCIONES DE ORDEN SUPERIOR
  // ==========================================================================
  println("\n--- SECCIÓN 6: FUNCIONES DE ORDEN SUPERIOR ---")

  val numeros = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val listaNombres = List("Ana", "Carlos", "María")

  // EJERCICIO 6.1: Usa map para obtener el cuadrado de cada número
  // val cuadrados = numeros.map(???)

  // EJERCICIO 6.2: Usa filter para obtener solo los números pares
  // val pares = numeros.filter(???)

  // EJERCICIO 6.3: Usa reduce para sumar todos los números
  // val sumaTotal = numeros.reduce(???)

  // EJERCICIO 6.4: Usa fold con valor inicial 100 para sumar
  // val sumaConInicial = numeros.fold(???)(???)

  // EJERCICIO 6.5: Usa flatMap para dividir palabras
  // val palabras = List("Hola Scala", "Spark Streaming")
  // val todasPalabras = palabras.flatMap(???)

  // EJERCICIO 6.6: Usa find para encontrar el primer número mayor que 5
  // val primerMayorCinco = numeros.find(???)

  // EJERCICIO 6.7: Usa groupBy para agrupar números por paridad
  // val agrupadosPorParidad = numeros.groupBy(???)

  // EJERCICIO 6.8: Usa zip para combinar nombres con edades
  // val edadesLista = List(25, 30, 28)
  // val personasZip = listaNombres.zip(???)

  // EJERCICIO 6.9: Encadena filter, map y sum
  // Obtén la suma de los dobles de los números mayores que 5
  // val resultado = numeros
  //   .filter(???)
  //   .map(???)
  //   .sum

  // EJERCICIO 6.10: Define una función que reciba otra función como parámetro
  // def aplicarOperacion(nums: List[Int], op: Int => Int): List[Int] = ???

  // ==========================================================================
  // SECCIÓN 7: CONTROL DE FLUJO
  // ==========================================================================
  println("\n--- SECCIÓN 7: CONTROL DE FLUJO ---")

  // EJERCICIO 7.1: Usa if-else como expresión para categorizar edad
  // val edadPersona = 20
  // val categoria = if (???) "Menor" else if (???) "Adulto" else "Senior"

  // EJERCICIO 7.2: Usa for con yield para obtener cuadrados del 1 al 5
  // val cuadradosFor = for (i <- ???) yield ???

  // EJERCICIO 7.3: Usa for con filtro para obtener solo pares del 1 al 10
  // val paresFor = for {
  //   i <- 1 to 10
  //   if ???
  // } yield i

  // EJERCICIO 7.4: Usa for con múltiples generadores
  // Genera todas las combinaciones de (1,2,3) con ('a','b','c')
  // val combinaciones = for {
  //   i <- ???
  //   j <- ???
  // } yield s"$i$j"

  // ==========================================================================
  // SECCIÓN 8: PATTERN MATCHING
  // ==========================================================================
  println("\n--- SECCIÓN 8: PATTERN MATCHING ---")

  // EJERCICIO 8.1: Completa el pattern matching para días de la semana
  // val dia = 3
  // val nombreDia = dia match {
  //   case 1 => ???
  //   case 2 => ???
  //   case 3 => ???
  //   case _ => ???
  // }

  // EJERCICIO 8.2: Pattern matching con guards para calificaciones
  // val nota = 85
  // val calificacion = nota match {
  //   case n if ??? => "Sobresaliente"
  //   case n if ??? => "Notable"
  //   case n if ??? => "Aprobado"
  //   case _ => "Suspenso"
  // }

  // EJERCICIO 8.3: Define una función con pattern matching por tipos
  // def describir(x: Any): String = x match {
  //   case i: Int => ???
  //   case s: String => ???
  //   case l: List[_] => ???
  //   case _ => ???
  // }

  // EJERCICIO 8.4: Pattern matching con case class
  case class Persona(nombre: String, edad: Int)
  
  // def procesar(p: Persona): String = p match {
  //   case Persona(nombre, edad) if ??? => s"$nombre es adulto"
  //   case Persona(nombre, _) => ???
  // }

  // EJERCICIO 8.5: Pattern matching con Option
  // def buscarEdad(nombre: String): Option[Int] = {
  //   val edades = Map("Ana" -> 25, "Carlos" -> 30)
  //   edades.get(nombre)
  // }
  // 
  // val resultado = buscarEdad("Ana") match {
  //   case Some(edad) => ???
  //   case None => ???
  // }

  // ==========================================================================
  // SECCIÓN 9: EJERCICIO FINAL - TRANSFORMACIÓN DE DATOS
  // ==========================================================================
  println("\n--- SECCIÓN 9: EJERCICIO FINAL - TRANSFORMACIÓN DE DATOS ---")

  // Datos de vuelos para procesar
  case class Vuelo(
    id: String,
    origen: String,
    destino: String,
    pasajeros: Int,
    distanciaKm: Int,
    retrasado: Boolean
  )

  val vuelos = List(
    Vuelo("IB001", "Madrid", "Barcelona", 150, 500, false),
    Vuelo("IB002", "Madrid", "París", 180, 1200, true),
    Vuelo("IB003", "Barcelona", "Londres", 200, 1500, false),
    Vuelo("IB004", "Madrid", "Roma", 160, 1400, true),
    Vuelo("IB005", "Valencia", "Berlín", 120, 1800, false),
    Vuelo("IB006", "Madrid", "Lisboa", 140, 600, false),
    Vuelo("IB007", "Barcelona", "Ámsterdam", 175, 1300, true),
    Vuelo("IB008", "Madrid", "Londres", 190, 1200, false)
  )

  // EJERCICIO 9.1: Filtra los vuelos que NO están retrasados
  // val vuelosNoRetrasados = vuelos.filter(???)
  // println(s"Vuelos no retrasados: ${vuelosNoRetrasados.size}")

  // EJERCICIO 9.2: Calcula el total de pasajeros de todos los vuelos
  // val totalPasajeros = vuelos.map(???).sum
  // println(s"Total pasajeros: $totalPasajeros")

  // EJERCICIO 9.3: Agrupa los vuelos por ciudad de origen
  // val vuelosPorOrigen = vuelos.groupBy(???)
  // vuelosPorOrigen.foreach { case (ciudad, vs) =>
  //   println(s"$ciudad: ${vs.size} vuelos")
  // }

  // EJERCICIO 9.4: Calcula estadísticas por origen
  // Para cada origen calcula: total pasajeros, distancia media, % retrasados
  // val estadisticasPorOrigen = vuelos
  //   .groupBy(???)
  //   .map { case (origen, vuelosOrigen) =>
  //     val totalPax = ???
  //     val distanciaMedia = ???
  //     val pctRetrasados = ???
  //     (origen, totalPax, distanciaMedia, pctRetrasados)
  //   }

  // EJERCICIO 9.5: Encuentra las 3 rutas más populares (origen-destino con más pasajeros)
  // val rutasMasPopulares = vuelos
  //   .groupBy(v => ???)
  //   .mapValues(???)
  //   .toList
  //   .sortBy(???)
  //   .take(3)

  // EJERCICIO 9.6: Usa for comprehension para obtener vuelos largos sin retraso
  // val vuelosLargosSinRetraso = for {
  //   vuelo <- vuelos
  //   if ???
  //   if ???
  // } yield s"${vuelo.id}: ${vuelo.origen}->${vuelo.destino}"

  // EJERCICIO 9.7: Crea un mapa de lookup de vuelos por ID
  // val vuelosPorId: Map[String, Vuelo] = vuelos.map(v => ???).toMap

  // EJERCICIO 9.8: Usa partition para separar retrasados de no retrasados
  // val (retrasados, noRetrasados) = vuelos.partition(???)

  // EJERCICIO 9.9: Calcula estadísticas globales usando foldLeft
  case class EstadisticasVuelo(
    totalVuelos: Int,
    totalPasajeros: Int,
    distanciaTotal: Int,
    vuelosRetrasados: Int
  )

  // val estadisticasGlobales = vuelos.foldLeft(EstadisticasVuelo(0, 0, 0, 0)) { (acc, vuelo) =>
  //   EstadisticasVuelo(
  //     totalVuelos = ???,
  //     totalPasajeros = ???,
  //     distanciaTotal = ???,
  //     vuelosRetrasados = ???
  //   )
  // }

  // EJERCICIO 9.10: Usa collect para filtrar y transformar en un paso
  // Obtén info de vuelos cortos (< 1000 km)
  // val infoVuelosCortos: List[String] = vuelos.collect {
  //   case Vuelo(id, origen, destino, _, dist, _) if ??? =>
  //     s"$id: Vuelo corto de $origen a $destino ($dist km)"
  // }

  println("\n" + "=" * 60)
  println("FIN DE LOS EJERCICIOS DE SCALA")
  println("=" * 60)
}
