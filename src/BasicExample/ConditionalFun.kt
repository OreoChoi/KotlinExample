package BasicExample

/**
 * 1. If문 Example1 (조건식)
 * */
fun ifExample(intA: Int, intB: Int): Int {
    if (intA > intB) {
        return intA
    } else {
        return intB
    }
}

/**
 * 2. If문 Example2 (식몸체)
 * */
fun ifExample2(intA: Int, intB: Int) = if (intA > intB) intA else intB

/**
 * 3. If문 Example3
 *
 * - 아래 코드는 예제 이므로 실제 프로젝트에서 저렇게 길게 코드를 작성하면 안됩니다.
 * */
fun ifExample3(x:Int){
    var result:Boolean = if(x>100){
        true
    }else{
        false
    }
}

/**
 * 4. 범위 비교문 Example
 * */
fun rangeExample():Boolean{
    val x = 1
    val y = 9

    return x in 1..y
}

/**
 * 5. When문 예제 1
 * */
fun whenExample(): String {
    val any: String = "banana"

    return when (any) {
        "banana","tomato" -> "Good"
        "apple" -> "Normal.."
        else ->  "Not Good..."
    }
}

/**
 * 6. When문 예제 2
 *   - 특정 식을 조건으로 넣을수도 있다.
 * */
fun whenExample2(): String {
    val any: String = "banana"

    return when (true) {
        any.equals("banana") -> "Good"
        else ->  "Not Good..."
    }
}

/**
 * 7. When문 예제 3
 *   - 범위 , 콜렉션을 사용해 검사할수있다.
 * */
fun whenExample3():Unit {
    val target:Int = 11
    val list:List<Int> = listOf(1,10,11)


    when (target) {
        in 1..10 -> println("1..10 !!")
        in list -> println("list !!")
        !in 10..20 -> println("10..20 not !!")
    }
}

/**
 * 8. When문 예제 4 (식 몸체)
 * */
fun whenExample4(x:Int) = when(x){
    in 1..10 -> "Good"
    else -> "Not Good"
}