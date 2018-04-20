package edu.kotlinessentials.ch07

fun main(args: Array<String>) {
    println("Ex07-05 Inheritance")

    val instance = Derived(1)
    println("$instance, p=${instance.p}")
    instance.p = 11
    println("p=${instance.p}")

    val instance2 = Derived2(10)
    println("$instance, base=${instance2.baseIntVal}, derived=${instance2.derivedIntVal}")

    val instance3 = Derived3(100)
    println("$instance3, intVal=${instance3.intVal}")
    instance3.intVal = 123
    println("intVal=${instance3.intVal}")
    // getter의 리턴이 field인 경우와 super.intVal인 경우 출력값이 다름!

    val instance4 = Derived4(10)
    println("$instance4, p=${instance4.p}")
    instance4.p = 12345
    println("p=${instance4.p}")

    val instance5 = Derived4(11)
    println("$instance5, p=${instance5.p}")
    instance5.p = 112233
    println("p=${instance5.p}")

    val child = Child("Black", "Brown")
    println("hair=${child.hairColor}, eye=${child.eyeColor}")
    child.changeHairColor("Dark Brown")
    child.printHairColor()

}

// By default, all classes in Kotlin are final:
// Effective Java Item 19: Design and document for inheritance or else prohibit it.
// The open annotation on a class allows others to inherit from this class.

//open class Base(var p: Int)
//class Derived(var p: Int): Base(p)
// compile error:
// -> 'p' hides member of supertype 'Base' and needs 'override' modifier
// -> 'p' in 'Base' is final and cannot be overridden

open class Base(open var p: Int)
class Derived(override var p: Int): Base(p)

open class Base2(var baseIntVal: Int)
class Derived2(var derivedIntVal: Int): Base2(derivedIntVal)

open class Base3(open var intVal: Int)
class Derived3: Base3 {
    override var intVal: Int
        get() = field
//        get() = super.intVal
        set(value) {
            field = value
        }

    constructor(intVal: Int): super(intVal) {
        this.intVal = intVal
    }
}

open class Base4(var p: Int)
class Derived4(p: Int): Base4(p)

open class Base5(var p: Int)
class Derived5: Base5 {
    constructor(p: Int): super(p) /*{
        this.p = p
    }*/
}

open class Father(var hairColor: String, var eyeColor: String) {
    open fun changeHairColor(color: String) {
        hairColor = color
        println("Father changed hair color.")
    }
}
class Child(hairColor: String, eyeColor: String): Father(hairColor, eyeColor) {
    override fun changeHairColor(color: String) {
        this.hairColor = color
        println("Child changed hair color.")
    }

    fun printHairColor() {
        println("Child hair color is $hairColor.")
    }
}
