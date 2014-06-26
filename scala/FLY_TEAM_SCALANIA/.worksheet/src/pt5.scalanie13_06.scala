package pt5

object scalanie13_06 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(68); 
  println("Scalania 13.06.2014");$skip(47); 
  
  println("Welcome to the Scala worksheet")
  import ScalanieStrategiaLib._;$skip(110); 
  val kp = new KaczkaPolityczna(GlosneKwakanie) with NormalanStrategiaLatania;System.out.println("""kp  : pt5.ScalanieStrategiaLib.KaczkaPolityczna with pt5.ScalanieStrategiaLib.NormalanStrategiaLatania = """ + $show(kp ));$skip(9); val res$0 = 
  kp.lec;System.out.println("""res0: String = """ + $show(res$0));$skip(10); val res$1 = 
  kp.opis;System.out.println("""res1: String = """ + $show(res$1));$skip(11); val res$2 = 
  kp.kwacz;System.out.println("""res2: String = """ + $show(res$2));$skip(30); 
  val kd = new KaczkaDomyslna;System.out.println("""kd  : pt5.ScalanieStrategiaLib.KaczkaDomyslna = """ + $show(kd ));$skip(10); val res$3 = 
  kd.opis;System.out.println("""res3: String = """ + $show(res$3));$skip(11); val res$4 = 
  kd.kwacz;System.out.println("""res4: String = """ + $show(res$4));$skip(21); val res$5 = 
  kd.fun(UserId(1));System.out.println("""res5: pt5.Address = """ + $show(res$5));$skip(97); ;
  
  
  val kaczkaLesna = new KaczkaLesna(SzybkoINnormalnieKwacze) with NormalanStrategiaLatania;System.out.println("""kaczkaLesna  : pt5.ScalanieStrategiaLib.KaczkaLesna with pt5.ScalanieStrategiaLib.NormalanStrategiaLatania = """ + $show(kaczkaLesna ));$skip(26); val res$6 = 
  
  
  kaczkaLesna.kwacz;System.out.println("""res6: String = """ + $show(res$6));$skip(18); val res$7 = 
  kaczkaLesna.lec;System.out.println("""res7: String = """ + $show(res$7))}
}

case class Address
case class UserId(id: Int) extends AnyVal

object ScalanieStrategiaLib {
  abstract class Kaczka extends StrategiaLatania {
    def kwacz = " kwacze"
    def lec = "lece"
    def opis: String

    //podejscia
    //mozna tak - wtedy nazwy są wazne bo typ nam nic nie mówi
    def findAdress(userId: String): String = "aaa"
    //mozna dowolne nazwy a intencje wyrazic typami

    //mozna tez tak - nie przez nazwy a przez typy
    def fun(a: UserId): Address = new Address
  }
  trait StrategiaLatania {
    def lec: String
  }

  trait NormalanStrategiaLatania extends StrategiaLatania {
    override def lec: String = "lece bo chce"
  }
  
  trait StrategiaSzybkiego

  class KaczkaDomyslna extends Kaczka {
    override def opis = "jestem kaczka domyslna"
  }

  class KaczkaPolityczna(strategiaKwak: StrategiaKwakania) extends Kaczka {
    override def kwacz = strategiaKwak.kwacz
    override def opis = "jestem kaczka polityczna"
  }

  class KaczkaDzika(strategiaKwak: StrategiaKwakania) extends Kaczka {
    override def kwacz = strategiaKwak.kwacz
    override def opis = "jestem kaczka dzika"
  }

	class KaczkaLesna(strategiaKwakania:StrategiaKwakania) extends Kaczka{
    override def kwacz = strategiaKwakania.kwacz
    override def opis = "jestem kaczka dzika"
	}

  trait StrategiaKwakania {
    def kwacz: String
  }

  object GlosneKwakanie extends StrategiaKwakania {
    override def kwacz: String = "kwacze glosno"
  }

  object CichoKwakanie extends StrategiaKwakania {
    override def kwacz: String = "kwacze cicho"
  }
  
  object SzybkoINnormalnieKwacze extends StrategiaKwakania{
  	override def kwacz = "kwacze szybko i normalnie"
  }
}
