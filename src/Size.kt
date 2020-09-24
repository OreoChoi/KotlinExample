/**
 * jhChoi - 20200924
 * 다중 init 예제
 * */
class Size(width:Int, height:Int){
    val width = width
    val height:Int

    init{
        this.height = height
    }

    val area:Int

    init{
        area = width * height
    }
}