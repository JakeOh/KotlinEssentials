package edu.kotlinessentials.ch07

fun main(args: Array<String>) {
    println("Ex07-01 Primary Constructors")

    val a = A("Jake Oh", "02-1234-5678")
    println(a)
    println("a{name:${a.name}, telNo:${a.telNo}}")

//    val a2 = A() // compile error: No constructor without parameter

    val b = B("Alan", "010-1111-1111")
    println(b)
    println("b{name:${b.name}, telNo:${b.telNo}}")

//    val c = C("", "") // compile error: private constructor
    val c = C.newC("Maxim", "010-2222-2222")
    println(c)
    println("c{name:${c.name}, telNo:${c.telNo}}")

    val d = D("Albert", "010-3333-3333")
    println(d)
    println("d{name:${d.name}, telNo:${d.telNo}}")
    // not d._name and not d._telNo

    val e = E("Schrodinger", "010-4444-4444")
    println(e)
    println("e{name:${e.name}, telNo:${e.telNo}}")

    val f = F("Heidelberg", "010-5555-5555", 0)
    println(f)
    println("f{name:${f.name}, telNo:${f.telNo}, type: ${f.type}}")
}

// class Classname constructor(var member: Type, ...) { // body }
class A (var name: String, var telNo: String)

class B constructor(var name: String, var telNo: String)

class C private constructor(var name: String, var telNo: String) {
    companion object {
        fun newC(name: String, telNo: String): C {
            return C(name, telNo)
        }
    }
}

// "var" is not used in the default constructor
// when the paramter name of the constructor and the property name are different
class D (_name: String, _telNo: String) {
    var name = _name
    var telNo = _telNo
}

class E (name: String, telNo: String) {
    var name: String
    var telNo: String

    // initialization block
    init {
        this.name = name
        this.telNo = telNo
    }
}

// When do we use initializaton block?
// When we need to check and initialize values of constructor arguments
class F (var name: String, var telNo: String, var type: Int = 4) {
    init {
        this.type = if (type in 1..3) type else 4
        // 1: school, 2: company, 3: SNS, 4: etc
    }
}
