package edu.kotlinessentials.ch11

fun main(args: Array<String>) {
    println("EX11-01 Generics")
    // raw vs generic types

    val list = newList(1, 2, 3, 4, 5)
    println(list)

    println()
    println(sum/*<Int>*/(1, 2, 3))
    println(sum/*<Double>*/(1.1, 2.2, 3.3))
//    println(sum<String>("1"))

}

fun <E> newList(vararg args: E): List<E> {
    val result = ArrayList<E>()
    for (arg in args) {
        result.add(arg)
    }
    return result
}

fun <T: Number> sum(vararg args: T): Double {
    var result = 0.0
    for (arg in args) {
        result += arg.toDouble()
    }
    return result
}
