
object Typ{

    fun getT(){
        var i : Int =2

        var f : Float = i.toFloat()

        //runtime'da en efektif türe cevriliyor,
        // var i : Int =  2 primitive type ' a ceviriyor
        //generic typda ise wrapper

        //Tüm tipler Any ' den like object fakat java da int, double almıyor
        //burda Any'den hepsi ref alır.



        var ix : Any = 2
        var z : Float = (ix as Int).toFloat()

        var ixz : Any = "2"
        //cast edemezsen null gönder exception atma ve bunuda mecburen
        //null check gerekiyor
        var cz : Float = (ixz as? Int).toFloat()


        var ind : Int? = null
        ind?.rangeTo(10)  //ind null degilse gönder

        var range: IntRange = i!!.rangeTo(13) //zorunlu

        //platform tipleri javadan cagırılan typlar
        // tek ! olursa null olabilir javadan gelenleri, yazılımcıları uyarmak için
        //consistn daha tutarlı diller any jvm de zaten object' dönüşüyor
        Integer.parseInt(" ")

        var ib = 12_3322_2231L

            var icc : Any = 5
        when(icc) {
            //smart cast is ' i görünce otomatik convert edicek
            is Int -> print(icc)
        }
    }
}