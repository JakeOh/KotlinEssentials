package edu.kotlinessentila.ch05

fun main(args: Array<String>) {
    println("Ex05-01 let Operator")

    val userId: String? = getUserId()
//    sendNotification(userId)
    // Error:(7, 22) Kotlin: Type mismatch: inferred type is String? but String was expected

    if (userId != null) sendNotification(userId)

    userId?.let { userId -> sendNotification(userId) }

    userId?.let { sendNotification(userId) }

    userId?.let { sendNotification(it) }
}


fun getUserId(): String? {
    return "user01"
}

fun sendNotification(userId: String) {
    println("Sent a message to $userId")
}
