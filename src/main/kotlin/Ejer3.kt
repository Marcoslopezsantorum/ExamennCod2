class Ejer3 {
    val list = { array: Array<Int> ->
        array.filter {
            it % 2 != 0
        }.forEach(){
            println(it)
        }
    }
}