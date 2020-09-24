/**
 * jhChoi - 20200924
 * 클래스 포함 함수 선언 예제
 * */
class InnerFunctionExample(val msg: String) {

    //이와 같이 클래스내에 함수가 표함 가능하다.
    fun print() {
        println("$msg")
    }
}

fun main(args:Array<String>){
    val innerFun:InnerFunctionExample = InnerFunctionExample("Print Please!!")
    innerFun.print()    //클래스에 포함된 함수 실행
}