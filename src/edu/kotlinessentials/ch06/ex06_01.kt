package edu.kotlinessentials.ch06

fun main(args: Array<String>) {
    println("Ex06-01")

    println(min1(1, 2))
    println(min2(1, 2))
    println(min1(param1 = 10, param2 = 2)) // named argument
}

// fun funtionName(parameter: Type = defaultValue, ... ): ReturnType { // body }
fun min1(param1: Int, param2: Int): Int {
    return if (param1 < param2) param1 else param2
}

// omit return type: Kotlin's type inference
fun min2(param1: Int, param2: Int) =
        if (param1 < param2) param1 else param2

// default value of parameters
