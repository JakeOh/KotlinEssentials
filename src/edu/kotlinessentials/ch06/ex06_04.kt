package edu.kotlinessentials.ch06

fun main(args: Array<String>) {
    println("Ex06-04 Extension Function")

    val mutableList = mutableListOf(1, 2, 3, 4, 5)
    println(mutableList)

    mutableList.swap(0, 1)
    println(mutableList)
}

// Extension function: extends the functionality of a class without inheriting the class
fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
    val temp = this[index1]     // this: receiver instance
    this[index1] = this[index2]
    this[index2] = temp
}
