package edu.kotlinessentials.ch09

fun main(args: Array<String>) {
    println("Ex09-01 Exception Handling")

    var result: Int? = 0

    try {
        result = parseInt("7A")
    } catch (e: Exception) {
        result = -1
    } catch (e: NumberFormatException) {
        result = null
    } finally {
        println("result = $result")
    }

    // try~catch expression
    var result2 = try {
        parseInt("7A")
    } catch (e: NumberFormatException) {
        null
    }
    println("result2 = $result2")
}

fun parseInt(value: String): Int {
    return value.toInt()
}
