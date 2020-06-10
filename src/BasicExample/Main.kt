package BasicExample

/**
 * Main - 20200610
 * 프로그램 시작점
 * */
fun main(args: Array<String>) {
    label1@ for (i in 1..10) {
        for (j in 1..10) {
            println(j)
            if (j == 4) {
                break@label1
            }
        }
    }
}

