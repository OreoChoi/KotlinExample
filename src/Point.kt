/**
 * jhChoi - 20200924
 *
 * 연산자 operator 예제
 * 객체의 사칙연산
 * */
class Point(var x: Int = 0, var y: Int = 0) {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }

    operator fun minus(other: Point): Point {
        return Point(x - other.x, y - other.y)
    }

    operator fun times(other: Point): Point {
        return Point(x * other.x, y * other.y)
    }

    operator fun div(other: Point): Point {
        return Point(x / other.x, y / other.y)
    }

    fun print(){
        println("x: $x, y: $y")
    }
}