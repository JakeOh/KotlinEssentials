package edu.kotlinessentials.ch07

fun main(args: Array<String>) {
    println("Data Classes\n")

    val contact1 = Contact("Newton", "1111-2222", "newton@physics.edu")
    println(contact1)               // toString()
    println(contact1.hashCode())    // hashCode()

    println()
    val contact2 = Contact("Newton", "1111-2222", "newton@physics.edu")
    println(contact1 == contact2)   // equals()
    println(contact1 === contact2)  // compare the references

    println()
    val contact3 = contact1.copy()
    println(contact3)
    println(contact3.hashCode())
    println(contact3 == contact1)
    println(contact3 === contact1)

    println()
    val contact4 = contact1.copy(phone = "1111-0000")
    println(contact4)
    println(contact4.hashCode())
    println(contact4 == contact1)
    println(contact4 === contact1)

    println()
    // Destructuring declaration
    val (name, phone, email) = contact3 // componentN()
    println("$name, $phone, $email")
//    val n = contact3.component1()
//    val p = contact3.component2()
//    val e = contact3.component3()
//    println("$n, $p, $e")

    val (cname, _, cemail) = contact3
    println("$cname, $cemail")

    println()
    val p1 = Person("Heisenberg")
    p1.age = 100
    println(p1)
    println(p1.hashCode())

    val p2 = Person("Heisenberg")
    p2.age = 99
    println(p2.hashCode())
    println(p1 == p2)
    println(p1 === p2)

    val p3 = p2.copy()
    println(p3.age)

}

data class Contact(val name: String, val phone: String, val email: String)

// Note that the compiler only uses the properties defined inside the primary
// constructor for the automatically generated functions. To exclude a property
// from the generated implementations, declare it inside the class body:
data class Person(val name: String) {
    var age: Int = 0
}
