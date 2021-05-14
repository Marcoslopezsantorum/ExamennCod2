<<<<<<< 3Ejercicio
import kotlin.random.Random

fun main(args: Array<String>) {
    for (numero in Tabla(11).array) {
        println(numero)
    }
    val array = Ejer2(10) { Random.nextInt(50, 250) }

    array.array.forEach {
        println(it)
    }
    val array2 = Ejer3().list(Ejer2(10, {Random.nextInt(50, 250)}).array)
}
=======
import kotlin.random.Random

fun main(args: Array<String>) {
    for (numero in Tabla(11).array) {
        println(numero)
    }
    val array = Ejer2(10) { Random.nextInt(50, 250) }

    array.array.forEach {
        println(it)
    }
}
>>>>>>> master
