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

    fun getN() {
        var isimler = listOf("tarik", "mehmet")
        for (isim in isimler) {
            print(isim)
        }

        var i =2
        var twoToTen = i.rangeTo(10)


        for (a in twoToTen) {
            print(a)
        }

        var twoToten = 2..10

        for (i in 0..isimler.count()-1){
            print(i)
        }

        for (i in isimler.indices){
            print(isimler.get(i))
        }


        for (i in 4 downTo  1) {
            print(i)
        }

        for (i in 4 downTo 1 step 2){
            print(i)
        }

        for (i in 0..5 step 2) {
            print(i)
        }

        var number = 1
        when (number){

            1 ->{ print("asd") }

          in  1..10 -> print("1 ila 10 arasınd")
          !in  1..10 -> print("1 ila 10 arasında degil")

        }

    }
}

