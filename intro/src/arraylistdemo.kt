package day4
data class Product (var id:Int,var name:String,var price :Int)

fun main()
{
    var myList = ArrayList<String>()
    myList.add("john")
    myList.add("suresh")
    var productList = ArrayList<Product>()
    productList.add(Product(100,"mobile",45000))
    productList.add(Product(101,"laptop",3000))
    productList.add(Product(102,"cloth",5000))

    println(productList)
    for(item in productList)
        println(item)
    println("=======filter====")
    productList.asSequence().filter { s->s.price>4000 }.forEach { s-> println(s) }
    println("===count===")
    var size = productList.count()
    println("no of product "+ size)
}