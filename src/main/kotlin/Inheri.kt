//open demezsek kalıtım alamaz



abstract class Base(name: String){
    constructor(name: String, age:Int):this(name)
    {

    }
        open fun ce(){

        }
}


interface Op{
    fun hll()
}
open class Inheri(name: String) : Op{
    constructor(name: String, age : Int):this(name){

    }
    open fun cr(){
        print("ov")
    }

    override fun hll() {
        TODO("Not yet implemented")
    }
}

class Amazon : Inheri{
    constructor(name: String, age: Int, address:String): super(name,age){

    }
    override fun cr() {

    }
}

