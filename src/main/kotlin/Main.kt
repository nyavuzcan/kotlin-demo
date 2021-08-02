/*
object declaration syntaxt - like singleton
 */
object Main {
    @JvmStatic
    fun main(arg: Array<String>){
        println(getName())
        getLastName()
    }

    fun getName() : String {
        var name = "Nevo"
        var age = 2

        val pp = Profile()
        pp.getFirstName()
        pp.latVar = "ge"

        return "$name ${age -1}"
    }
}

