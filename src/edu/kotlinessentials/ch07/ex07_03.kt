package edu.kotlinessentials.ch07

fun main(args: Array<String>) {
    println("Ex07-03 Properties vs Fields")

    val f = MyFriend()
    f.fiendName = "Bohr"
    f.friendType = 0
    println("f{friendName:${f.fiendName}, friendType:${f.friendType}")

}

class MyFriend {
    // property
    var fiendName: String = "Unknown Name"
        // accessor: getter
        get() {
            println("getter for friendName called")
            return field
        }
        // accessor: setter
        set(value) {
            println("setter for friendName called")
            field = if (value == "") "Unknown Name" else value
        }
    var friendType: Int = 4
        set(value) {
            println("setter for friendType called")
            field = if (value in 1..3) value else 4
        }
}
