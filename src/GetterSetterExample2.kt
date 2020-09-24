/**
 * jhChoi - 20200924
 * getter setter 구현 예제
 * */
class Computer(var name: String = "", var price: String = "") {

    operator fun get(position: Int): String {
        return when (position) {
            0 -> name
            1 -> price
            else -> "알수없음"
        }
    }

    operator fun set(position: Int, value: String) {
        when (position) {
            0 -> name = value
            1 -> price = value
        }
    }
}

fun main(args: Array<String>) {
    val com1: Computer = Computer()

    com1[0] = "mac"
    com1[1] = "1000000"

    println(com1[0])
    println(com1[1])
}
