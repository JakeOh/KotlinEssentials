package edu.kotlinessentials.ch08

fun main(args: Array<String>) {
    println("Ex08-03 Lambda: Closure")

    println(calculateSum(1, 100))

    println()
    val array1 = Array(5, {i -> "Name${i + 1}"})
    println(array1)
    for (element in array1) {
        print("$element, ")
    }
    println()

    println()
    val list1 = listOf(1, 2, 3, 4, 5, 6, 7)
    println(list1.filter { it % 2 ==  0})
    println(list1.map { it * 10 })

    println(friends.filter { it.age in 10..19 })
//    println(friends.filter { it.age in 10..19 }.map { it.name })
    println(friends.filter { it.age in 10..19 }.map(Friend::name))

}

fun calculateSum(from: Int, to: Int): Int {
    var total = 0

    val calc = there@ {f: Int, t: Int ->
        for (i in f..t) {
            total += i
        }
        return@there
    }

    calc(from, to)

    return total
}
