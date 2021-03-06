package edu.kotlinessentials.ch05

fun main(args: Array<String>) {
    println("Ex05-03 Platform Type")

    printJavaClass(JavaClass("Java Platform Variable"))

    printJavaClass(JavaClass(null))
    // IllegalStaeException if using #1

}

fun printJavaClass(jClass: JavaClass) {
//    println(jClass.platformVariable.toLowerCase()) // #1
    println((jClass.platformVariable ?: "Null").toLowerCase())
}

