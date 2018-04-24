package edu.kotlinessentials.ch10

fun main(args: Array<String>) {
    println("Ex10-05 Sequences")

    var count = 0
    val seq1 = generateSequence(count) { it + 1 }
    println(seq1)
//    println("sum of seq1 = ${seq1.sum()}")

    val seq2 = seq1.takeWhile { it <= 5 }
    println(seq2)
    for (el in seq2) {
        println(el)
    }
    println(seq2.toList())
    println(seq2.sum())

    println()
    val seq3 = sequenceOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(seq3)
    println(seq3.toList())
    println(seq3.sum())
}

