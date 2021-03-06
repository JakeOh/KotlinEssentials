package edu.kotlinessentials.ch08

fun main(args: Array<String>) {
    println("Ex08-01 Lambda")

    println(sum1(1, 2))
    println(sum9(10, 20))
    println(sum10(100, 200))
    println(sum11(1000, 2000))

    println()
    println(funcExec1(11, 22, sum4))
    println(funcExec1(11, 22, { x, y -> x * y }))

    println()
    val listOfLambdas = ArrayList<(Int, Int) -> Int>()
    listOfLambdas.add(sum5)

    val subtract = { x: Int, y: Int -> x - y }
    listOfLambdas.add(subtract)

    listOfLambdas.add({ x, y -> x * y})

    for (i in 0 .. (listOfLambdas.size - 1)) {
        println(listOfLambdas[i](1, 2))
    }
}

fun sum1(x: Int, y: Int): Int {
    return x + y
}

// Single-Expression functions
fun sum2(x: Int, y: Int): Int = x + y
// Explicitly declaring the return type is optional when this can be inferred by the compiler:
fun sum3(x: Int, y: Int) = x + y

// anonymous functions
val sum4: (Int, Int) -> Int = fun(x: Int, y: Int): Int { return x + y }
val sum5: (Int, Int) -> Int = fun(x, y): Int { return x + y }
val sum6: (Int, Int) -> Int = fun(x, y): Int = x + y

val sum7 = fun(x: Int, y: Int): Int { return x + y }
val sum8 = fun(x: Int, y: Int) = x + y

// lambda expressions
val sum9: (Int, Int) -> Int = { x, y -> x + y }
val sum10 = { x: Int, y: Int -> x + y }

val sum11 = { x: Int, y: Int ->
    println("$x + $y = ${x+y}")
    x + y   //implicit return
    }

// higher-order functions
fun funcExec1(x: Int, y: Int, func: (Int, Int) -> Int): Int {
    return func(x, y)
}
