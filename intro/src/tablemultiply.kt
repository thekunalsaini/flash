import java.util.*

fun main()
{
    print("enter table: ")
    var scan = Scanner(System.`in`)
    var table = scan.nextInt()
    print("enter the limit: ")
    var limit = scan.nextInt()

    for(i in 1..limit)
    {
        println("$table * $i = ${table*i}")
    }
}

