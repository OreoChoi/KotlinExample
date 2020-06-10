package BasicExample


/**
 * 1. 기본적인 함수 정의
 * */
fun sum(a: Int, b: Int): Int {
    return a + b
}

/**
 * 2. 식 몸체 (expression body) 를 사용한 함수 정의
 * */
fun minus(a: Int, b: Int) = a - b

/**
 * 3. 의미 없는 값을 리턴하는 함수
 *
 *  - Unit 타입은 자바의 Void와 유사하며 의미 없는 값을 리턴한다
 *  - Unit은 선언을 생략이 가능하다.
 * */
fun printHello(): Unit {
    println("Hello Kotlin World!!!")
}

/**
 * 4. val 예제
 *
 *  - 1회만 초기화 가능한(mutable) 수 이다
 *  - var과는 반대의 속성을 지니고 있다
 * */
fun valExample() {
    val a: Int = 1  // Int형 변수에 즉시 값 할당
    val b = 2       // Int형으로 추론 및 값 할당
    val c: Int       // Int형 변수 선언
    c = 3           // 값 할당
}


/**
 * 5. var 예제
 *
 *  - 가변(immutable) 수 이다
 *  - val과는 반대의 속성을 지니고 있다
 * */
fun varExample() {
    var a: Int = 1
    a = 3 + 2
}

/**
 * 6. 주석
 *   - 실제 프로그램에 사용되는 문구는 아니지만 프로그램의 해석을 돕는
 * */
fun comment() {
    // 줄 주석 이라고 한다.

    /*
    * 주석 블록 이라고 한다.
    * */

    /**
     * 문서화 주석 이라고 하며
     * reference Doc을 만들기 위해 사용된다.
     * */
}

/**
 * 7. 문자열
 *    - 문자열 사용 방식
 * */
fun toString() {
    val num = 10
    println("num = $num")   //num 변수를 이와 같이 출력 가능하다

    val age: String = "Ten"
    println("$age.lenght is ${age.length}") //임의의 식도 사용가능

    val introduction: String = """
        안녕하세요 현재 사용하는 문자열은
        개행 문자가 없더라도 자동으로 개행을 넣어서 표시가 가능합니다
        ....
        """.trimMargin()

    println(introduction)
}

/**
 * 8. 코틀린 기본 타입
 * */
fun kotlinType() {
    //숫자형
    val double: Double = 3.14
    val float: Float = 3.14f
    val long: Long = 100_000_000L
    val int: Int = 100_000_000 //1.1 부터 구분자인 _를 지원한다.
    val short: Short = 10
    val byte: Byte = 10

    //문자형
    val char: Char = 'a'
    val string: String = "hello world"

    //불리언
    val boolean: Boolean = true

    //배열
    val doubleArray: DoubleArray = doubleArrayOf(1.1, 2.2, 3.3)
    val floatArray: FloatArray = floatArrayOf(1.1f, 2.2f, 3.3f)
    val longArray: LongArray = longArrayOf()
    val intArray: IntArray = intArrayOf(1, 2, 3)
    val shortArray: ShortArray = shortArrayOf(1,2,3)
    val byteArray: ByteArray = byteArrayOf(1,2,3)
    val charArray: CharArray = charArrayOf('a', 'b', 'c')
    val booleanArray :BooleanArray = booleanArrayOf(true,false,true)
}