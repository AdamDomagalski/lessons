package pt3

object werkszit4 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(75); 
  println("Scalania fly team 30 maja 2014")

import NKaczki._;$skip(67); 

val kaczka = new DzikaKaczka(LatajacaStrategia);System.out.println("""kaczka  : pt3.NKaczki.DzikaKaczka = """ + $show(kaczka ));$skip(13); val res$0 = 

kaczka.opis;System.out.println("""res0: String = """ + $show(res$0));$skip(11); val res$1 = 
kaczka.lec;System.out.println("""res1: String = """ + $show(res$1))}

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
