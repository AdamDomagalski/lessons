package pt3

object werkszit3 {
  println("Scalania fly team 30 maja 2014")       //> Scalania fly team 30 maja 2014
import Kaczki._

val kaczka2 = new Kaczka{
	def opis = "anonimiowa kaczka"
	}                                         //> kaczka2  : pt3.Kaczki.Kaczka = pt3.werkszit3$$anonfun$main$1$$anon$1@3e9d75c
                                                  //| 5

  val kaczka:Kaczka = new DomowaKaczka()          //> kaczka  : pt3.Kaczki.Kaczka = pt3.Kaczki$DomowaKaczka@539ef8a0
  kaczka.opis                                     //> res0: String = jestem domowa
  kaczka.kwacz                                    //> res1: String = kwacze
  kaczka.lec                                      //> res2: String = domowa mało lata


  val kaczka3:Kaczka = new GumowaKaczka()         //> kaczka3  : pt3.Kaczki.Kaczka = pt3.Kaczki$GumowaKaczka@6282ffe6
  kaczka3.opis                                    //> res3: String = jestem gumowa
  kaczka3.kwacz                                   //> res4: String = kwacze
  kaczka3.lec                                     //> res5: String = lece
}




object Kaczki{
	abstract class Kaczka{
		def lec="lece"
		def kwacz="kwacze"
		def opis:String
	}
	
	class DzikaKaczka extends Kaczka{
		def opis ="jestem dzika"
	}
	
	class DomowaKaczka extends Kaczka{
		def opis = "jestem domowa"
		override def lec="domowa mało lata"
	}
	
	class GumowaKaczka extends Kaczka{
		def opis="jestem gumowa"
		
	}
}