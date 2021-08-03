class ProfileT private constructor(firstName: String) { //primary içine kod yok
//private constructor( var firstName: String)
    var firts = firstName
    init {
        //secondory yerine cagırılır.
        //
        print(firstName)
    }
        constructor(firstName: String, lastName: String):this("asd") {
            //kod yazılabilir
        }

    fun writeSm() {
        firts

       // private constructor( var firstName: String
    // //var ile tanımlamada cagırabiliyoruz )
    }
/*
nested inner class
    inner class Account{
        fun writeFirstName(){
          firts
        }
    }*/
/*class Account{
    fun writeFirstName(){
        firts
    }
}*/

}