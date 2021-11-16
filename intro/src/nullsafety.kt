fun main(){
    var name:String?="sachin"
    print(name)

    name = null
    print(name)

    name?.let { print("let") }
}