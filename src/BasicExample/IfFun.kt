package BasicExample

/**
 * If문 - (조건식)
 * */
fun ifExample(intA: Int, intB: Int): Int {
    if (intA > intB) {
        return intA
    } else {
        return intB
    }
}

/**
 * if문 - (식몸체)
 * */
fun ifExample2(intA: Int, intB: Int) = if (intA > intB) intA else intB