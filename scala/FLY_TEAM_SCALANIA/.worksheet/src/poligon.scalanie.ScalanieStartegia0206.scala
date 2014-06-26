package poligon.scalanie

object ScalanieStartegia0206 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(100); 
  println("Welcome to the Scala worksheet")
  
  //import ScalanieStrategiaLib._
  
  //val kaczka:Kaczka=new KaczkaLesna(CicheKwakanie) with StrategiaDupnegoLatania with StrategiaSzybkiegoLatania
                                                  
  //kaczka.opis
  //kaczka.lec
  
  import StrategiaFunctionalPower._;$skip(313); 
  
  val kaczka = new Kaczka(kwakanie);System.out.println("""kaczka  : poligon.scalanie.StrategiaFunctionalPower.Kaczka = """ + $show(kaczka ));$skip(46); 
	val glosneKwakanie = kwakanie andThen glosno;System.out.println("""glosneKwakanie  : Unit => String = """ + $show(glosneKwakanie ));$skip(19); val res$0 = 
  glosneKwakanie();System.out.println("""res0: String = """ + $show(res$0));$skip(60); 
  
 
 	val niemrawaKaczka = kaczka.zmianaKwakania(niemrawo);System.out.println("""niemrawaKaczka  : poligon.scalanie.StrategiaFunctionalPower.Kaczka = """ + $show(niemrawaKaczka ));$skip(23); val res$1 = 
 	niemrawaKaczka.kwacz;System.out.println("""res1: String = """ + $show(res$1))}
 	
}

object StrategiaFunctionalPower{

	type Zachowanie= Unit=>String
	type Kawakanie= Unit=>String
	type Dekorator = String =>String

	val kwakanie :Zachowanie= _=>"Kwakam"
	val glosno=(b:String)=>b+" glosno"
	val niemrawo = (b:String) => b + " niemrawo"
	class Kaczka(sk:Unit=>String){
		def kwacz = sk()
		
		def zmianaKwakania(dekorator: String => String) = new Kaczka(sk andThen  dekorator)
	}
}

object ScalanieStrategiaLib{

	class KaczkaLesna(sk:StrategiaKwakania) extends Kaczka(sk){
		def opis="kaczka lesna"
	}

	object CicheKwakanie extends StrategiaKwakania{
		def kwakam="kwakam cicho"
	}

	trait StrategiaSzybkiegoLatania extends StrategiaLatania{
		override abstract def lec=super.lec+ " i szybko"
	}

	trait StrategiaDupnegoLatania extends StrategiaLatania{
		override def lec="latam dupnie"
	}

	trait StrategiaLatania{
		def lec:String
	}

	trait StrategiaNormalnegoLatania extends StrategiaLatania{
		override def lec="latam normalnie"
	}

	trait StrategiaKwakania{
		def kwakam:String
	}

	object GlosneKwakanie extends StrategiaKwakania{
		def kwakam="kwakam glosno"
	}

	abstract class Kaczka(sk:StrategiaKwakania) extends StrategiaLatania{
		def kwacz=sk.kwakam
		def lec="latam"
		def opis:String
	}

	class DzikaKaczka(sk:StrategiaKwakania) extends Kaczka(sk){
		def opis="jestem dzika"
	}

	class PolitycznaKaczka(sk:StrategiaKwakania) extends Kaczka(sk){
		def opis="jestem polityczna"
	}
}
