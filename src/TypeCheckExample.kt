/**
 * jhChoi - 20200924
 * - 객체의 타입을 체크합니다.
 * */
fun typeCheck(obj:Any):Int?{ //Any는 모든 객체들의 부모격이다
    //is 키워드는 객체 타입을 체크합니다.
    if(obj is String){
        println("String 입니다.")
    }else if(obj is Int){
        println("Int 입니다.")
    }else {
        println("그 이외의 타입입니다.")
    }

    return null
}

fun main(args:Array<String>){
    typeCheck("hello")
    typeCheck(1)
    typeCheck(1.1)
}