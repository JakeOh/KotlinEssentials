package edu.kotlinessentials.ch06

fun main(args: Array<String>) {
    println("Ex03-03 Generic Functions")

    val list1 = newList(1, 3, 5, 7, 9)
    println(list1)
}

// Generic function
fun <T> newList(vararg args: T): ArrayList<T> {
    val list = ArrayList<T>()
    for (arg in args) {
        list.add(arg)
    }

    return list
}
