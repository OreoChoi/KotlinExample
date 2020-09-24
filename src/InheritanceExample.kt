/**
 * jhChoi - 20200924
 * 상속 예제
 *
 * - 코틀린은 자바와는 달리, 클래스 선언이 기본적으로 final로 되어있다.
 * */
open class Person(val name: String, val age: Int)

class Student(name: String, age: Int, val id: Int) : Person(name, age)

fun main(args: Array<String>) {
    val person = Person("Choi", 28)
    val student = Student("JunHo", 28, 20200225)
}

