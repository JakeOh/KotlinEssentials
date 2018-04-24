package edu.kotlinessentials.ch10

import kotlin.streams.asStream
import kotlin.streams.toList

fun main(args: Array<String>) {
    println("Ex10-04 Sequences, Streams")
    // sequence (JDK 1.6) vs stream (JDK 1.8) - JDK 1.8 Stream
    // pipeline
    // intermediate(lazy) vs terminal operation

    val list1 = listOf(1, 2, 3, 4, 5)
            .asSequence()
            .map { println("map($it)"); it * it }
            .filter { println("filter($it)"); it % 2 == 0 }
            .toList()   // #1 terminal operation(function) - cf. #2
    println(list1)

    println()
    val list2 = listOf(1, 2, 3, 4, 5).asSequence().asStream()
            .map { println("map($it)"); it * it }
            .filter { println("filter($it)"); it % 2 == 0 }
            .toList()
    println(list2)

    println()
    val list3 = listOf(1, 2, 3, 4, 5)
            .map { println("map($it)"); it * it }
            .filter { println("filter($it)"); it % 2 == 0 }
    println("Collection chain call: $list3")

    println()
    val list4 = listOf(1, 2, 3, 4, 5).asSequence()
            .map { println("map($it)"); it * it }
            .filter { println("filter($it)"); it % 2 == 0 }
            // #2 there is no terminal operation(function) - cf. #1
    println("Sequence chain call: $list4")
    for (el in list4) {
        println(el)
    }

}
