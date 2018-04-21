package edu.kotlinessentials.ch07

fun main(args: Array<String>) {
    println("Ex07-12 Delegation")

    val rectangle = Rectangle()
    val circle = Circle()

    val window1 = Window(rectangle)
    window1.drawFigure()
    window1.fillFigure()

    Window(circle).drawFigure()
    Window(circle).fillFigure()

    println()
    val rect2 = Rectangle2()
    Window2(rect2).draw()
    Window2(rect2).fill()
}

abstract class Figure {
    abstract fun draw()
    abstract fun fill()
}

class Rectangle: Figure() {
    override fun draw() {
        println("Draw a rectangle.")
    }

    override fun fill() {
        println("Fill a rectangle.")
    }
}

class Circle: Figure() {
    override fun draw() {
        println("Draw a circle.")
    }

    override fun fill() {
        println("Fill a circle.")
    }
}

class Window(val figure: Figure) {
    fun drawFigure() {
        figure.draw()
    }

    fun fillFigure() {
        figure.fill()
    }
}

// Delegation in Kotlin
interface Figure2 {
    fun draw()
    fun fill()
}

class Rectangle2: Figure2 {
    override fun draw() {
        println("Draw a rectangle.")
    }

    override fun fill() {
        println("Fill a rectangle.")
    }
}

class Window2(figure: Figure2): Figure2 by figure
