package edu.kotlinessentials.ch07

fun main(args: Array<String>) {
    println("Ex07-13 Delegation 2")

    // Override a member of an interface implemented by delegation
    val b = DelegationTestImpl(10)
    DelegationDerived(b).printMessage()
    DelegationDerived(b).printMessageLine()

    println()
    // Note, however, that members overridden in this way do not get called from
    // the members of the delegate object, which can only access its own
    // implementations of the interface members:
    val b2 = BaseImplEx13(100)
    println(b2.message)
    println(DerivedEx13(b2).message)    // Message of Derived
    DerivedEx13(b2).print()             // BaseImplEx13: x = 100
}

interface DelegationTest {
    fun printMessage()
    fun printMessageLine()
}

class DelegationTestImpl(val x: Int) : DelegationTest {
    override fun printMessage() {
        print(x)
    }

    override fun printMessageLine() {
        println(x)
    }
}

class DelegationDerived(b: DelegationTest) : DelegationTest by b {
    override fun printMessage() {
        print("abc")
    }
}

interface BaseEx13 {
    val message: String
    fun print()
}

class BaseImplEx13(val x: Int) : BaseEx13 {
    override val message = "BaseImplEx13: x = $x"
    override fun print() {
        println(message)
    }
}

class DerivedEx13(b: BaseEx13) : BaseEx13 by b {
    override val message = "Message of Derived"
}
