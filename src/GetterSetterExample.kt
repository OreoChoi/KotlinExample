/**
 * jhChoi - 20200924
 * getter setter 구현 예제
 * */
class Apple {
    var count: Int = 0
        get() {
            return field
        }
        set(count) {
            field = if (count >= 0) count else 0
        }

    fun print() {
        println(count)
    }
}

fun main(args: Array<String>) {
    val apple: Apple = Apple()

    //Setter 조건식에 맞지 않는 값을 대입
    apple.count = -1
    apple.print()

    //Setter 조건식에 맞는 값을 대입
    apple.count = 99
    apple.print()
}
