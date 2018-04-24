package edu.kotlinessentials.ch10

fun main(args: Array<String>) {
    println("Ex10-01 Collections")

    val list1 = listOf("1", "2", "3")   // immutable list
    println(list1)
//    list1.add("4")
//    list1.remove("3")

    println()
    val list2 = mutableListOf("1", "2", "3")    // mutable list
    println(list2)
    list2.add("5")
    list2.remove("3")
    println(list2)

    println()
    val list3 = arrayListOf("1", "2", "3")  // mutable list
    println(list3)
    list3.add("4")
    list3.remove("2")
    println(list3)

    println()
    val list4 = ArrayList<String>(list1)
    println(list4)
    list4.add("4")
    list4.remove("3")
    println(list4)
}


