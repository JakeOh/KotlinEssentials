package edu.kotlinessentials.ch07

fun main(args: Array<String>) {
    println("Data Classes")

    val contact1 = Contact("Newton", "1111-2222", "newton@physics.edu")
    println(contact1)               // toString()
    println(contact1.hashCode())    // hashCode()

    val contact2 = Contact("Newton", "1111-2222", "newton@physics.edu")
    println(contact1 == contact2)   // equals()
    println(contact1 === contact2)  // compare the references

    val contact3 = contact1.copy(phone = "1111-0000")
    println(contact3)
    println(contact3.hashCode())
    println(contact3 == contact1)
    println(contact3 === contact1)

    // Destructuring declaration
    val (name, phone, email) = contact3 // componentN()
    println("$name, $phone, $email")
//    val n = contact3.component1()
//    val p = contact3.component2()
//    val e = contact3.component3()
//    println("$n, $p, $e")

    val (cname, _, cemail) = contact3
    println("$cname, $cemail")

}

data class Contact(val name: String, val phone: String, val email: String)
