package BasicExample

/**
 * 1. for문으로 출력하는 예제
 * */
fun forStringExample() {
    val items = listOf("apple", "banana", "kiwi")

    for (item in items) { //리스트를 순차적으로 꺼내 출력함
        println(item)
    }
}

/**
 * 2. for문으로 출력하는 예제2
 * */
fun forStringExample2() {
    val items = listOf("apple", "banana", "kiwi")

    for (index in items.indices) {
        println(items[index])
        println("Current index $index")
    }
}


/**
 * 3. for문으로 출력하는 예제3
 * */
fun forIntegerExample() {
    var items: ArrayList<Int> = ArrayList()
    items.add(1)
    items.add(2)
    items.add(3)

    for (item in items) {
        println(item)
    }
}


/**
 * 4. WhileExample
 * */
fun whileExample() {
    val items = listOf("apple", "banana", "tomato")
    var index = 0

    while (index < items.size) {
        println("Current Index $index")
        println("Current Index ${items[index]}")
        index++
    }
}

/**
 * 5. 단순 범위 반복
 * */
fun rangeLoopExample() {
    for (x in 1..5) {
        println(x)
    }
}

/**
 * 6. 단순 범위 반복2
 * */
fun rangeLoopExample2() {
    for (x in 1..10 step 2) { //2개씩 증가
        println(x)
    }

    for (x in 9 downTo 0 step 3) { //3개씩 감소
        println(x)
    }
}

/**
 * 7. 단순 범위 반복3
 * */
fun rangeLoopExample3() {
    for (x in 1 until 10) {   //until은 마지막 수는 포함하지 않고 반복합니다.
        println(x)
    }
}

/**
 * 8. do While 예제
 * */
fun doWhileExample() {
    var a = 10

    do {
        a--
    } while (a == 0)
}

/**
 * 9. break문 예제
 * */
fun returnExample() {
    for (index in 1..10) {
        if (index == 3) {
            break
        }
    }

    label1@ for (i in 1..10) {
        for (j in 1..10) {
            if (j == 4) {
                break@label1
            }
        }
    }
}

/**
 * 10. continue 예제
 * */
fun continuewExample(){
    for(x in 1..10){
        if(x == 3){
            continue
        }
    }
}