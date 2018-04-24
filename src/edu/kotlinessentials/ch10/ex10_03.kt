package edu.kotlinessentials.ch10

fun main(args: Array<String>) {
    println("Ex10-03 Collections: Range")

    val range = IntRange(1, 10)
    range.forEach { print("$it ") }
    println()

    (1..10).forEach { print("$it ") }
    println()

    println("the first value of range: ${range.first}")
    println("the last value of range: ${range.last}")
    println("the step of range: ${range.step}")
    println("start of range: ${range.start}")
    println("endInclusive of range: ${range.endInclusive}")
}
