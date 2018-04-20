package edu.kotlinessentials.ch07

fun main(args: Array<String>) {
    println("EX07-06 Interface")

    val instance = MyImplementation()
    println("prop = ${instance.prop}")
    println("propertyWithImplementation = ${instance.propertyWithImplementation}")
    instance.boo()
    instance.foo()
    instance.foo2()

    val pro = ProfessionalMusician("Piano")
    pro.play()
    val ama = AmateureMusician()
    ama.play()
}

interface MyInterface {
    val prop: Int   // abstract

    val propertyWithImplementation: String
        get() = "foo"

    fun boo()       // abstract

    fun foo() {
        println(prop)
    }

    fun foo2() {
        println(propertyWithImplementation)
    }
}

class MyImplementation: MyInterface {
    override val prop: Int = 100

    override fun boo() {
        println("$this, $prop, $propertyWithImplementation")
    }
}

interface PlayMusic {
    val instrument: String   // abstract
    val instrumentType: Int
        get() = 1
    fun play()
}

class ProfessionalMusician(override val instrument: String):
        Musician(), PlayMusic {
    override fun play() {
        super<Musician>.play()
        println("Professional plays the $instrument")
    }
}

class AmateureMusician: Musician(), PlayMusic {
    override val instrument: String = "Guitar"

    override fun play() {
        println("Amateur plays the $instrument")
    }
}

open class Musician {
    open fun play() {
        println("Musician is now playing")
    }
}