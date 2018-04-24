package edu.kotlinessentials.ch10

fun main(args: Array<String>) {
    println("Ex10-02 Collections: Iterator")

    val list = listOf(1, 2, 3, 4, 5, 6)
    val itr = list.iterator()
    var item: Int
    while (itr.hasNext()) {
        item = itr.next()
        println(item)
    }
    println()

    for (el in list) {
        println(el)
    }
}
