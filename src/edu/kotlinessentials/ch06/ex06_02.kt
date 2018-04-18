package edu.kotlinessentials.ch06

// Scope
// 1. Top-level scope (cf.static method in Java)
// 2. Member function (defined in a class)
// 3. Local function (must be defined before it is called)


fun main(args: Array<String>) {
    println("Ex06-02 Scope")

    println(getSummation(1, 100))
    println(calcCombination(45, 6))

}

var count: Int = 0      // private static int count; & getter/setter
val TAB1 = '\t'         // private static final String TAB1; & getter
const val TAB2 = '\t'   // public static final String TAB2;

// Top-leverl scope function
// public static final int getSummation(int from, int to) { // implementation }
fun getSummation(from: Int = 0, to: Int = 0): Int {
    count = 0
    for (i in from..to) {
        count += i
    }

    return count
}

fun calcCombination(whole: Int, selected: Int): Double {
    // Local function
    fun  calcFactorial(num: Int): Double {
        var total: Double = 1.0
        for (i in num downTo 1) {
            total *= i
        }

        return total
    }

    if (selected > whole || selected <= 0 || whole <= 0) {
        return -1.0
    } else if (selected == whole) {
        return 1.0
    }

    return calcFactorial(whole) /
            (calcFactorial(whole - selected) * calcFactorial(selected))
}
