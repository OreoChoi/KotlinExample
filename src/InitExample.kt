/**
 * jhChoi - 20200924
 * 다중 init 예제
 * */
class Size(width:Int, height:Int){
    val width = width   //선언과 동시에 init 하거나
    val height:Int		//선언 후 init블록 내에서 init 하는 방법이 있다.

    init{
        this.height = height
        println("init1")
    }

    val area:Int

    init{
        area = width * height
        println("init2")
    }
}

fun main(args:Array<String>){
    val size:Size = Size(100,200)
}