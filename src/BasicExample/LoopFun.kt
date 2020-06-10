package BasicExample

/**
 * 1. for문으로 출력하는 예제
 * */
fun forStringExample(){
    val items = listOf("apple","banana","kiwi")

    for(item in items){ //리스트를 순차적으로 꺼내 출력함
        println(item)
    }
}

/**
 * 2. for문으로 출력하는 예제2
 * */
fun forStringExample2(){
    val items = listOf("apple","banana","kiwi")

    for(index in items.indices){
        println(items[index])
        println("Current index $index")
    }
}


/**
 * 3. for문으로 출력하는 예제3
 * */
fun forIntegerExample(){
    var items:ArrayList<Int> = ArrayList()
    items.add(1)
    items.add(2)
    items.add(3)

    for (item in items){
        println(item)
    }
}


/**
 * 4. WhileExample
 * */
fun whileExample() {
    val items = listOf("apple", "banana", "tomato")
    var index = 0

    while(index < items.size){
        println("Current Index $index")
        println("Current Index ${items[index]}")
        index++
    }
}
