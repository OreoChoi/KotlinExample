/**
 * jhChoi - 20200924
 * 호출 연산자인 invoke를 오버로딩 예제
 * */
class Product{
    operator fun invoke(value:Int){
        println("value : $value")
    }

    operator fun invoke(value:Int, name:String){
        println("value : $value")
        println("value : $value")
    }
}

fun main(args: Array<String>) {
    val product = Product()

}

