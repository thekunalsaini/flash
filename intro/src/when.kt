fun main(){
    var day = 2
    when(day){
        1->println("one")
        2->println("two")
        else->println("invalid")
    }

    println("=======RETURN AND STORE IN A VARIABLE========")
    var day1 = when(day){
        1->"one"
        2->"two"
        else->"invalid"
    }
    println(day1)
    //var day = 2
    when(day){
        in 1..7->{println("1..7")
            print(day)}
        in 8..14->println("8..14")
        else->println("invalid")
    }

}