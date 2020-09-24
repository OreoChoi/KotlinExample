/**
 * 1. 어떤형태의 객체인지 검사 합니다.
 *  - is 연산자는 해당 객체가 어느 클래스인지 검사가능하다
 * */
fun typeCheckExample(obj:Any):Int?{ //Any는 모든 객체들의 부모격이다
    if(obj is String){
        return obj.length
    }

    return null
}