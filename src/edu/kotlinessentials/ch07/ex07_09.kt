package edu.kotlinessentials.ch07

fun main(args: Array<String>) {
    println("Ex07-09 Ojbect Expressions")

    val submitButton = MyButton("Submit")
    submitButton.setOnClickListener(object : MyButton.OnClickListener {
        override fun onClick() {
            println("Submitted!")
        }
    })
    submitButton.click()

    val cancelButton = MyButton("Cancel")
    cancelButton.listener = object : MyButton.OnClickListener {
        override fun onClick() {
            println("Cancelled!")
        }
    }
    cancelButton.click()

}

class MyButton(val name: String) {
    var listener: OnClickListener? = null

    fun setOnClickListener(listener: OnClickListener) {
        this.listener = listener
    }

    fun click() {
        listener!!.onClick()
    }

    interface OnClickListener {
        fun onClick()
    }
}
