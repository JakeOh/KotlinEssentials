package edu.kotlinessentials.ch09

fun main(args: Array<String>) {
    println("Ex09-02 User Defined Exception")

    try {
        throwUserException()
    } catch (e: Throwable /* e: Exception */) {
        // Exception 타입으로 선언하면 catch가 안됨
        println(e.message)
    } finally {
        println("Now finally executing")
    }
}

class UserException(msg: String) : Throwable(msg)

fun throwUserException() {
    println("Throwing UserException")
    throw UserException("User Exception")
}
