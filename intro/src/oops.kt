
class student(id:Int,name:String)
{
    var myid:Int;
    var myname:String;
    init {
        myid=id;
        myname=name.uppercase()
    }
    fun disp(){
        println(myid)
        println(myname)
    }
}

fun main(){
    var s = student(1,"kunal")
    s.disp()
}