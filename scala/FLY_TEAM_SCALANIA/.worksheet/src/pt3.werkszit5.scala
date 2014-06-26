package pt3

object werkszit5 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(75); 
  println("Scalania fly team 30 maja 2014")}

import NKaczki._
//TODO this should work :(
//val kaczka44 = new DzikaKaczka(LatajacaStrategia) with GlosneKwakanie with ZrodloProtein

//kaczka44.opis
//kaczka44.lec
//kaczka44.ile
}

object NKaczki{
	
	abstract class NKaczka(strategiaLatania:Lata) extends Kwakajacy{
		def lec=strategiaLatania.lec
		def kwacz="kwacze"
		def opis:String
		
		//def map(f:Lata=>Lata): Kaczka
	}
	
	
	trait Kwakajacy{
		def kwacz:String
	}
	
	trait Lata{
		def lec:String
	}

	trait Kwakanie{
		def kwacz:String
	}
	
	trait ZrodloProtein{
	def ile = 200
	}
	
	trait GlosneKwakanie extends Kwakanie{
		def kwacz:String = "Kwacze glosno"
	}
	
	object LatajacaStrategia extends Lata{
		def lec= "ja latam"
	}
	
	object PrzyziemnaStrategia extends Lata{
		def lec = "ja NIE latam"
	}
	
	class DzikaKaczka(strategiaLatania:Lata) extends NKaczka(strategiaLatania){
	def opis ="jestem dzika"
	//def map(f:Lata=>Lata = new DzikaKaczka(f(strategiaLatania))
	}
	
	// na tym konczy sie przyklad z ksiazki
}
