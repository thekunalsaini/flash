import java.util.*

fun main()
{
    print("enter your name: ")
    var scan = Scanner(System.`in`)
    var name = scan.nextLine()
    print("enter the limit: ")
    var limit = scan.nextInt()
    for(i in 1..limit)
    println(name)
}

