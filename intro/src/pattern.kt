fun main() {
    println("Enter number");
    var num : Int = Integer.parseInt(readLine())
    println("Pattern 1")
    for (i in 1..num) {
        for (j in 1..i) {
            print("$j ")
        }
        println()
    }
    println()
    println("Pattern 2")
    var sum : Int = 0
    for (i in 1..num) {
        for (j in 1..i) {
            sum++
            print("$sum ")
        }
        println()
    }
    println()
    println("Pattern 3")
    for (i in 1..num) {
        print("*")
        for (j in 1..num) {
            if (i == 1 || i == num) {
                print("*")
            } else {
                print(" ");
            }
        }
        print("*")
        println()
    }
    println()
    println("Pattern 4")
    for (i in 1..num) {
        for (j in 1..(i-1)) {
            print(" ")
        }
        print("*")
        println()
    }
}