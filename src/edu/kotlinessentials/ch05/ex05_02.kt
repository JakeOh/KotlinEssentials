package edu.kotlinessentials.ch05

fun main(args: Array<String>) {
    println("EX05-02 Smart Cast")

    smartCast(1)
    smartCast("smart cast test")
    smartCast(intArrayOf())
}

fun smartCast(t: Any) {
    if (t is String)
        println("length of t = ${t.length}") // t: smart cast to String

    when (t) {
        is Int -> println("Int $t")
        is String -> println("String lenght = ${t.length}")
        else -> println("Not an integer and not a string!")
    }
}
