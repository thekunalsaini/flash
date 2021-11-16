
data class Employee(var id:Int,var name:String, var dept :String,var Salary:Int,var age:Int)

fun main()
{
    var employeeList = ArrayList<Employee>()
    employeeList.add(Employee(1,"sourab","hr",45000,34))
    employeeList.add(Employee(2,"anil","tester",22000,44))
    employeeList.add(Employee(3,"mahesh","developer",36000,37))
    employeeList.add(Employee(4,"anil","hr",26000,25))
    // println(employeeList)
    println("=====loop===")
    //   for(item in employeeList)
    //      println(item)

    // employeeList.asSequence().forEach {  s-> println(s)}
    employeeList.forEach(::println)
    println("==display only hr dept==")
    employeeList.asSequence().filter { e->e.dept=="hr" }.forEach { s-> println(s) }
    println("==sorting by age==")
    employeeList.sortBy { it.age }
    println("after sorting")
    employeeList.forEach(::println)
    println("===sort by name===")
    employeeList.sortBy { it.name }
    employeeList.forEach(::println)
    println("===sort by name and salary===")
    employeeList.sortWith(compareBy<Employee> { it.name }.thenBy { it.Salary })
    employeeList.forEach(::println)
    var empcount = employeeList.count()
    println("total number of emp $empcount")
    var testerCount =employeeList.asSequence().filter { e->e.dept=="tester" }.count()
    println()
    var empsumdept= employeeList.asSequence().groupBy { it.dept }.mapValues { it.value.sumOf { it.Salary } }
    println(empsumdept)
    for(item in empsumdept.entries)
        println(item)
    println("===sum of all==")
    var sumsalary =employeeList.asSequence().sumOf { it.Salary }
    println("sum salary ${sumsalary}")
    println("===min salary ==")
    var minsalary =employeeList.asSequence().minOf{ it.Salary }
    println("min salary ${minsalary}")
}
