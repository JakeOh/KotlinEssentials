package edu.kotlinessentials.ch07

fun main(args: Array<String>) {
    println("Ex07-03 Properties vs Fields")

    val f = MyFriend()
    f.friendName = "Bohr"
    f.friendType = 0
    println("f{friendName:${f.friendName}, friendType:${f.friendType}")

    val t = TestBackingField()
    t.string = "Hi"
    println("length1=${t.length1}, length2=${t.length2}")

    val t2 = TestBackingProperty()
    (t2.table as HashMap)["a"] = 0
    println("value = ${t2.table["a"]}")
}

class MyFriend {
    // property
    var friendName: String = "Unknown Name"
        // accessor: getter
        get() {
            println("getter for friendName called")
            return field // field: backing field
            // The field identifier can only be used in the accessors of the property.
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

// A backing field will be generated for a property
// if it uses the default implementation of at least one of the accessors, or
// if a custom accessor references it through the field identifier.
class TestBackingField {
    var string: String = ""
        get() = field
        set(value) {
            field = if (value != "") value else "Unknown"
        }

    // in the following case there will be no backing field:
    val length1: Int
        get() = string.length

    // in the following case a backing field will be generated:
    val length2: Int = string.length
}

// Backing Properties
class TestBackingProperty {
    private var _table: Map<String, Int>? = null
    public val table: Map<String, Int>
        get() {
            if (_table == null) {
                _table = HashMap()
            }

            return _table ?: throw AssertionError("Set to null by another thread")
        }
}
