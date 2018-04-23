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
    // it: implicit name of a single parameter
    val list1 = listOf(1, 2, 3, 4, 5, 6, 7)
    println(list1.filter { it % 2 ==  0})
    println(list1.map { it * 10 })

    println(friends.filter { it.age in 10..19 })
//    println(friends.filter { it.age in 10..19 }.map { it.name })
    println(friends.filter { it.age in 10..19 }.map(Friend::name))

    //
    fun Friend.isOld() = age >= 30
    println(friends.filter { (Friend::isOld)(it) }.map(Friend::name))

    println()
    val createFriend = ::Friend     // assign constructor to a value
    println(createFriend("Newton", 1492))

    fun hello() = println("Hello Lambda expressoins")
    run(::hello)    // reference of hello() function is delivered as a parameter
    run { hello() }

    println()
    println(execute(10, 2, {x, y -> x / y}))
}

fun calculateSum(from: Int, to: Int): Int {
    var total = 0

    val calc = there@ {from: Int, to: Int ->
        for (i in from..to) {
            total += i
        }
        return@there    // qualified return
    }

    calc(from, to)

    return total
}

// inline functions
inline fun execute(x: Int, y: Int, exec: (v1: Int, v2: Int) -> Int): Int {
    return exec(x, y)
}

