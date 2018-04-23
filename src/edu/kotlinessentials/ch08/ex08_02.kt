package edu.kotlinessentials.ch08

fun main(args: Array<String>) {
    println("Ex08-02 Lambda")

    findHong(friends)
    findLee(friends)
    findPark(friends)
    findKim((friends))

}

data class Friend(val name: String, val age: Int)

val friends = listOf(Friend("김선달", 16),
        Friend("홍길동", 19),
        Friend("성춘향", 30),
        Friend("이몽룡", 29),
        Friend("박문수", 33))

fun findHong(freindList: List<Friend>) {
    for (friend in freindList) {
        if (friend.name.substring(0, 1) == "홍") {
            println("found ${friend.name}")
            return
        }
    }
    println("findHong() ended")
}

fun findLee(friendList: List<Friend>) {
    friendList.forEach {
        if (it.name.subSequence(0, 1) == "이") {
            println("found ${it.name}")
            return
        }
    }
    println("findLee() eneded")
}

fun findPark(friendList: List<Friend>) {
    friendList.forEach here@ {
        if (it.name.substring(0, 1) == "박") {
            println("found ${it.name}")
            return@here
        }
    }
    println("findPark() ended")
}

fun findKim(friendList: List<Friend>) {
    friendList.forEach {
        if (it.name.substring(0, 1) == "김")
            println("found ${it.name}")
        return@forEach
    }
    println("findKim() ended")
}
