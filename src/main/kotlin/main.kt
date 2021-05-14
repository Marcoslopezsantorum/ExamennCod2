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
