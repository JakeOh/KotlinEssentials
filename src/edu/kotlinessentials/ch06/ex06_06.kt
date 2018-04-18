package edu.kotlinessentials.ch06

fun main(args: Array<String>) {
    println("Ex06-06 Tail Recursive Function")

    println(calcFactorial1(5))
    println(calcFactorial2(5))
    println(calcFactorial3(5))
    println(calcFactorial4(5))
}

fun calcFactorial1(num: Int): Double {
    var result = 1.0
    for (i in num downTo 1) {
        result *= i
    }

    return result
}

// recursive function
fun calcFactorial2(num: Int): Double {
    var result = 1.0

    return if (num == 1) {
        result
    } else {
        num * calcFactorial2(num - 1)
    }

}

fun calcFactorial3(num: Int): Double =
        if (num == 1) 1.0 else num * calcFactorial3(num - 1)

// tail recursive function
tailrec fun calcFactorial4(num: Int, result: Double = 1.0): Double =
        if (num == 1) result
        else calcFactorial4(num - 1, result * num)
