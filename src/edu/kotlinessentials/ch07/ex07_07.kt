package edu.kotlinessentials.ch07

fun main(args: Array<String>) {
    println("Ex07-07 Object Declarations")

    println(ContactManager.contacts)
    println(ContactManager.numberOfContacts)

    ContactManager.addContact(1, "Newton")
    ContactManager.addContact(10, "Maxwell")
    ContactManager.addContact(20, "Schrodinger")
    ContactManager.addContact(30, "Einstein")

    println(ContactManager.contacts)
    println(ContactManager.numberOfContacts)

    ContactManager.removeContact(30)
    println(ContactManager.contacts)
    println(ContactManager.numberOfContacts)

    println(ContactManager.getContactName(21))

    val o1 = Outer()
    println(o1)
    val o2 = Outer()
    println(o2)

    println(Outer.InnerObject)
    println(o1.obj)
    println(o2.obj)

    Outer.InnerObject.printCount()
    Outer.InnerObject.printCount()
    o1.obj.printCount()
    o2.obj.printCount()
}

// Object Declaration -> Singleton
// NOTE: object declarations can't be local (i.e. be nested directly inside a function),
// but they can be nested into other object declarations or non-inner classes.
object ContactManager {
    var numberOfContacts: Int = 0
        private set(value) { field = value }

    val contacts: HashMap<Int, String> = HashMap()

    fun addContact(key: Int, name: String) {
        contacts[key] = name
        numberOfContacts++
    }

    fun removeContact(key: Int) {
        contacts.remove(key)
        numberOfContacts--
    }

    fun getContactName(key: Int): String? = contacts[key]
}

class Outer {
    object InnerObject {
        var count: Int = 0
            private set(value) { field = value }
        fun printCount() {
            count++
            println(count)
        }
    }

    val obj = InnerObject
}
