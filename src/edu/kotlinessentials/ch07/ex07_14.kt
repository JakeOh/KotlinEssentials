package edu.kotlinessentials.ch07

fun main(args: Array<String>) {
    println("Ex07-14 Enum Classes")

    println(FriendType.values())
    println(FriendType.values()[0])
    println(FriendType.COMPANY)
    println(FriendType.COMPANY.ordinal)
    println(FriendType.COMPANY.name)
    println(getFriendType(FriendType.SNS))

    println()
    println(RGBColor.RED)
    println(RGBColor.GREEN.ordinal)
    println(RGBColor.BLUE.name)
    println(RGBColor.ORANGE.getValue())
}

enum class FriendType {
    SCHOOL, COMPANY, SNS, OTHER
}

fun getFriendType(friend: FriendType) = when (friend) {
    FriendType.SCHOOL -> "school friend"
    FriendType.COMPANY -> "company friend"
    FriendType.SNS -> "sns friend"
    FriendType.OTHER -> "other friend"
}

enum class RGBColor(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0),
    INDIGO(75, 0, 130),
    VIOLET(238, 130, 238);
    // Note that if the enum class defines any members, you need to separate the
    // enum constant definitions from the member definitions with a semicolon.

    fun getValue() = (r * 256 + g) * 256 + b
}

enum class ProtocolState {
    WAITING {
        override fun signal() = TALKING
    },
    TALKING {
        override fun  signal() = WAITING
    };

    abstract fun signal(): ProtocolState
}
