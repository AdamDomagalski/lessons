package pt3

object werkszit4 {
  println("Scalania fly team 30 maja 2014")       //> Scalania fly team 30 maja 2014

import NKaczki._

val kaczka = new DzikaKaczka(LatajacaStrategia)   //> kaczka  : pt3.NKaczki.DzikaKaczka = pt3.NKaczki$DzikaKaczka@57ba39a5

kaczka.opis                                       //> res0: String = jestem dzikak
kaczka.lec                                        //> res1: String = ja latam

}

object NKaczki{
	trait Lata{
	def lec:String
}
//object daje to ze to jest singleton
	object LatajacaStrategia extends Lata{
		def lec= "ja latam"
	}
	
	object PrzyziemnaStrategia extends Lata{
		def lec = "ja NIE latam"
	}

	abstract class NKaczka(strategiaLatania:Lata){
		def lec=strategiaLatania.lec
		def kwacz="kwacze"
		def opis:String
	}
	
	class DzikaKaczka(strategiaLatania:Lata) extends NKaczka(strategiaLatania){
	def opis ="jestem dzikak"
	}
	
	// na tym konczy sie przyklad z ksiazki
}