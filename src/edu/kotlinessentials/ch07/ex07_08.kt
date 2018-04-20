package edu.kotlinessentials.ch07

fun main(args: Array<String>) {
    println("Ex07-08 Companion Objects")

    val instance = MyClass.newMyClass()
    instance.printInfo()
}

class MyClass {
    private constructor()
    fun printInfo() = println("$this")

    companion object {
        fun newMyClass(): MyClass = MyClass()   // factory method
    }
}
