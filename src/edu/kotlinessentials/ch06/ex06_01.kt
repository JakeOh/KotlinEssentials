package edu.kotlinessentials.ch06

fun main(args: Array<String>) {
    println("Ex06-01")

    println(min1(1, 2))
    println(min2(1, 2))
    println(min1(param1 = 10, param2 = 2)) // named argument
    println(min3(param2 = -1))

    val list1 = newIntList(1, 2, 3)
    println(list1)

    // spread operator(*)
    val intArr = intArrayOf(1, 2, 3)
    val list2 = newIntList(10, 20, 30, *intArr, 40, 50)
    println(list2)
}

// fun funtionName(parameter: Type = defaultValue, ... ): ReturnType { // body }
fun min1(param1: Int, param2: Int): Int {
    return if (param1 < param2) param1 else param2
}

// omit return type: Kotlin's type inference
fun min2(param1: Int, param2: Int) =
        if (param1 < param2) param1 else param2

// default value of parameters
fun min3(param1: Int = 0, param2: Int = 0) =
        if (param1 < param2) param1 else param2

// variable-length argument
fun newIntList(vararg args: Int): ArrayList<Int> {
    val list = ArrayList<Int>()
    for (arg in args) {
        list.add(arg)
    }

    return list
}

