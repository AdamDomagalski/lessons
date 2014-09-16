package poligon.scalanie

object ScalanieStartegia0206 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  //import ScalanieStrategiaLib._
  
  //val kaczka:Kaczka=new KaczkaLesna(CicheKwakanie) with StrategiaDupnegoLatania with StrategiaSzybkiegoLatania
                                                  
  //kaczka.opis
  //kaczka.lec
  
  import StrategiaFunctionalPower._
  
  val kaczka = new Kaczka(kwakanie)               //> kaczka  : poligon.scalanie.StrategiaFunctionalPower.Kaczka = poligon.scalani
                                                  //| e.StrategiaFunctionalPower$Kaczka@69d4fb43
	val glosneKwakanie = kwakanie andThen glosno
                                                  //> glosneKwakanie  : Unit => String = <function1>
  glosneKwakanie()                                //> res0: String = Kwakam glosno
  
 
 	val niemrawaKaczka = kaczka.zmianaKwakania(niemrawo)
                                                  //> niemrawaKaczka  : poligon.scalanie.StrategiaFunctionalPower.Kaczka = poligon
                                                  //| .scalanie.StrategiaFunctionalPower$Kaczka@6f440a7a
 	niemrawaKaczka.kwacz                      //> res1: String = Kwakam niemrawo
 	
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