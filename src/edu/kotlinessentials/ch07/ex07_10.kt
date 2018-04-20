package edu.kotlinessentials.ch07

fun main(args: Array<String>) {
    println("Ex07-10 Nested and Inner Classes")

    val nested = OuterClass.NestedClass()
    println(nested.foo())

    val innerClass = OuterClass().InnerClass()
    println(innerClass.foo())

}

class OuterClass {
    private val bar: Int = 1

    // Nexted class
    class NestedClass {
        fun foo() = 2
    }

    // Inner class
    inner class InnerClass {
        fun foo() = bar
    }
}
