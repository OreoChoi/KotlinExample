/**
 * jhChoi - 20200924
 * 다중 생성자 예제
 * */
class Time{

    //첫 번째 생성자 (주 생성자)
    constructor(second:Int){
        println("second : $second")
    }

    //두번째 생성자 (보조 생성자이며 this 키워드를 사용해 주 생성자를 호출합니다.)
    constructor(minute: Int, second: Int) : this(minute * 60 + second){
        println("min : $minute")
    }

    //세번째 생성자
    constructor(hour: Int, minute: Int, second: Int) : this(hour * 60 + minute, second){
        println("hour : $hour")
    }

    //네번째 생성자 (주 생성자)
    constructor(time:String){
        println("current time : $time")
    }
}

fun main(args:Array<String>){
    val second:Time = Time(30)
    println("--------")
    val minute:Time = Time(10,30)
    println("--------")
    val hour:Time = Time(1,10,30)
    println("--------")
    val time:Time = Time("12h 03m 20s")

}