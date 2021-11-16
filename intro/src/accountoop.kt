
class account(name:String, acctype:String,inibal:Int,roi:Int)
{
    var name1=""
    var acctype1=""
    var inibal1=0
    var roi1=0
    init {
        this.name1=name
        this.acctype1=acctype
        this.roi1=roi
        this.inibal1=inibal
    }
    fun withdraw( rupee:Int)
    {
        if(rupee>inibal1)
            println("Amount not Avaiilable!!!")
        else{inibal1 -= rupee
        println("WITHDRAWAL SUCCESSFUL!!!")}
    }
    fun deposit( rupee:Int)
    {
        inibal1 += rupee
        println("DEPOSIT SUCCESSFUL!!!")
    }
    fun roi() : Int
    {
        return roi1
    }
    fun getbalance() : Int
    {
        return (inibal1+(inibal1*roi1)/100)
    }
    fun type() : String{
        return acctype1
    }
}


fun main(){
    var acc1 = account("kunal","savings",2000,10)
    acc1.withdraw(5000)
    acc1.deposit(2000)
    println( "Your RateOfInterest is : "+acc1.roi()+" %")
    println( "Your Account Type is : "+acc1.type() + " Account")
    println("Your Current Balance with ROI is : Rs. "+acc1.getbalance())
}


