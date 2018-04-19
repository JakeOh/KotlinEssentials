package edu.kotlinessentials.ch07

fun main(args: Array<String>) {
    println("Ex07-02 Secondary Constructors")

    // call the primary constructor
    val f = Friend()
    println(f)
    println("f{name:${f.name}, telNo:${f.telNo}, type:${f.type}}")

    // call secondary constructors
    val f1 = Friend("Maxwell", "1234-5678", 1)
    println(f1)
    println("f1{name:${f1.name}, telNo:${f1.telNo}, type:${f1.type}}")

    val f2 = Friend("Newton", "1234-0000")
    println(f2)
    println("f2{name:${f2.name}, telNo:${f2.telNo}, type:${f2.type}}")

    val f3 = Friend("Feynman")
    println(f3)
    println("f3{name:${f3.name}, telNo:${f3.telNo}, type:${f3.type}}")

}

class Friend () {
    var name: String = ""
    var telNo: String = ""
    var type: Int = 4

    // secondary constructors
    constructor(name: String, telNo: String, type: Int = 4): this() {
        this.name = name
        this.telNo = telNo
        this.type = if (type in 1..3) type else 4
    }

    constructor(name: String): this(name, "")
}
