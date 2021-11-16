fun main(){
    //mutable
    var marks = mutableListOf<Int>(10,20,30)
    println(marks)

    marks.add(40)
    marks.add(25)
    marks.sort()
    println(marks)
    marks.clear()
    println(marks)
    // see it -> var m = ListOf<String>("lol","lol","jhol")
}