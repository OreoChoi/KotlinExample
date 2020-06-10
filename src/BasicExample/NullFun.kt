package BasicExample

/**
 * Null을 선언하는 예제
 * */
fun nullExample(){
    val a:Int? = null // '?'를 대입하면 null도 대입할수있다.
    val b:Int = null // '?'가 없기에 에러가 표시된다.
}

/**
 * Null 값을 리턴하는 예제
 *  - Null값이 포함되는 변수에는 '?'를 표시해야합니다.
 * */
fun nullReturnExample(isEnable: Boolean): Int? {
    val a: Int? //Null값이 포함되기에 '?'를 붙여줍니다.

    if (isEnable) {
        a = 100
    } else {
        a = null
    }

    return a
}

/**
 * Null 값을 체크하는 예제
 * */
fun nullCheckExample(a: Int?): Boolean {
    val b: Int
    val result: Boolean

    //var b = a + 10  -> null체크를 하지 않았으니 에러로 표시된다.

    if (a != null) {
        b = a + 10
        result = true
    } else {
        result = false
    }

    return result
}