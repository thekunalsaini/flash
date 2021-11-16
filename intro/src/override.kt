fun main() {
    val square = Square()
    println(square.name)
    square.display()
}

open class Shape {
    open var name: String = "Shape"
    open fun display() = println("Shape is displayed")
}

class Square: Shape() {
    override var name: String = "Square"
    override fun display() = println("Square is displayed")
}

/*
val a: Int? = try { input.toInt() } catch (e: NumberFormatException) { null }
===================================
open class Rectangle {
    open fun draw() { /* ... */ }
}

interface Polygon {
    fun draw() { /* ... */ } // interface members are 'open' by default
}

class Square() : Rectangle(), Polygon {
    // The compiler requires draw() to be overridden:
    override fun draw() {
        super<Rectangle>.draw() // call to Rectangle.draw()
        super<Polygon>.draw() // call to Polygon.draw()
    }
}
==========================================
fun test(a: Int, b: Int) : Any {
    return try {
        a/b
        //println("The Result is: "+ a / b)
    }
    catch(e:Exception){
        println(e)
        "Divide by zero not allowed"
    }
}
// main function
fun main(args: Array<String>) {
    // invoke test function
    var result1 = test(10,2 ) //execute try block
    println(result1)
    var result = test(10,0 ) // execute catch block
    println(result)
}

======================================
open class Outer {
    private val a = 1
    protected open val b = 2
    internal open val c = 3
    val d = 4  // public by default

    protected class Nested {
        public val e: Int = 5
    }
}

class Subclass : Outer() {
    // a is not visible
    // b, c and d are visible
    // Nested and e are visible

    override val b = 5   // 'b' is protected
    override val c = 7   // 'c' is internal
}

class Unrelated(o: Outer) {
    // o.a, o.b are not visible
    // o.c and o.d are visible (same module)
    // Outer.Nested is not visible, and Nested::e is not visible either
}
==================================================

 */