fun main(){
    //mutable
    var java = mutableListOf<String>("sachin","saurabh","john","manish","anil")
    var sql = mutableListOf<String>("saurabh","sharma","anil","vishnu")
    java.addAll(sql)
    println(java)
    java.removeAll(sql)
    println(java)
    java.sort()
    println(java)

    /*===========================================
    val javaBatch = arrayListOf<String>("Sachin", "Sourab", "John", "Manish", "Anil")
    val sqlBatch = arrayListOf<String>("Sourab", "Sharma", "Anil", "Vishnu")
    var newList = javaBatch
    newList.addAll(sqlBatch)
    newList.sort()
    val newSet = newList.toSet()
    print(newSet)*/

}