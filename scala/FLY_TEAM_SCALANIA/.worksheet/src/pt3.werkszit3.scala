package pt3

object werkszit3 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(75); 
  println("Scalania fly team 30 maja 2014")
import Kaczki._;$skip(78); 

val kaczka2 = new Kaczka{
	def opis = "anonimiowa kaczka"
	};System.out.println("""kaczka2  : pt3.Kaczki.Kaczka = """ + $show(kaczka2 ));$skip(42); 

  val kaczka:Kaczka = new DomowaKaczka();System.out.println("""kaczka  : pt3.Kaczki.Kaczka = """ + $show(kaczka ));$skip(14); val res$0 = 
  kaczka.opis;System.out.println("""res0: String = """ + $show(res$0));$skip(15); val res$1 = 
  kaczka.kwacz;System.out.println("""res1: String = """ + $show(res$1));$skip(13); val res$2 = 
  kaczka.lec;System.out.println("""res2: String = """ + $show(res$2));$skip(44); 


  val kaczka3:Kaczka = new GumowaKaczka();System.out.println("""kaczka3  : pt3.Kaczki.Kaczka = """ + $show(kaczka3 ));$skip(15); val res$3 = 
  kaczka3.opis;System.out.println("""res3: String = """ + $show(res$3));$skip(16); val res$4 = 
  kaczka3.kwacz;System.out.println("""res4: String = """ + $show(res$4));$skip(14); val res$5 = 
  kaczka3.lec;System.out.println("""res5: String = """ + $show(res$5))}
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
