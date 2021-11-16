
open class vehicle(var t:String)
{

    fun disp()
    {
        print("$t")
    }
}

class twowheeler(var a:String) : vehicle(a){
    //var v=vehiclename
    //print("two wheeler")
}

class fourwheeler(var a:String) : vehicle(a) {
    //var v=vehiclename
    //print("four wheeler")
}

fun main(){
    var t = twowheeler("hero")
    var f = fourwheeler("honda")
    t.disp()
    f.disp()
}