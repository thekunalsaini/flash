fun main(){


    val largest: (Int, Int, Int) -> String = {
            a,b,c ->
        if(a>b && a>c)
            "a"
        else{
            if(b>c && b>a)
                "b"
        else "c"}
        }
    var name = {a:String -> a};
    var nam : (String)->Int= {
        it.length;
    }
    println(name("lol"))
    println(nam("lol"))
    println(largest(1,1,2))
}

