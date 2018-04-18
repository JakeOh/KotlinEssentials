package edu.kotlinessentials.ch06

fun main(args: Array<String>) {
    println("Ex06-05 Infix Function")

    val s1 = Score(100, 90)
    println(s1)

    val s2 = Score(50, 70)
    println(s2)

    println(s1.plus(s2))
    println(s1 plus s2)
//    println(s1 + s2)

    println(s1.times(s2))
    println(s1 times s2)

}

// Infix functions
// 1) It must be a member function or an extension function of a class.
// 2) It must have only one parameter.
// 3) It must be defined using "infix" before fun keyword.

data class Score(val korean: Int, val english: Int)

infix /*operator*/ fun Score.plus(other: Score): Score {
    return Score(korean + other.korean, english + other.english)
}

infix fun Score.times(other: Score): Score {
    return Score(korean * other.korean, english * other.english)
}
