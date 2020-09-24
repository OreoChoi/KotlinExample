/**
 * jhChoi - 20200924
 * 다중 생성자 예제
 * */
class Time(val second: Int) {

    constructor(minute: Int, second: Int) : this(minute * 60 + second) {
        println("생성자 1 실행")
    }

    constructor(hour: Int, minute: Int, second: Int) : this(hour * 60 + minute, second){
        println("생성자 2 실행")
    }

}