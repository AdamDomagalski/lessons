package pt5

object scalanie13_06 {
  println("Scalania 13.06.2014")                  //> Scalania 13.06.2014
  
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  import ScalanieStrategiaLib._
  val kp = new KaczkaPolityczna(GlosneKwakanie) with NormalanStrategiaLatania
                                                  //> kp  : pt5.ScalanieStrategiaLib.KaczkaPolityczna with pt5.ScalanieStrategiaLi
                                                  //| b.NormalanStrategiaLatania = pt5.scalanie13_06$$anonfun$main$1$$anon$1@63f12
                                                  //| af8
  kp.lec                                          //> res0: String = lece bo chce
  kp.opis                                         //> res1: String = jestem kaczka polityczna
  kp.kwacz                                        //> res2: String = kwacze glosno
  val kd = new KaczkaDomyslna                     //> kd  : pt5.ScalanieStrategiaLib.KaczkaDomyslna = pt5.ScalanieStrategiaLib$Kac
                                                  //| zkaDomyslna@35203c7f
  kd.opis                                         //> res3: String = jestem kaczka domyslna
  kd.kwacz                                        //> res4: String = " kwacze"
  kd.fun(UserId(1));                              //> res5: pt5.Address = Address()
  
  
  val kaczkaLesna = new KaczkaLesna(SzybkoINnormalnieKwacze) with NormalanStrategiaLatania
                                                  //> kaczkaLesna  : pt5.ScalanieStrategiaLib.KaczkaLesna with pt5.ScalanieStrateg
                                                  //| iaLib.NormalanStrategiaLatania = pt5.scalanie13_06$$anonfun$main$1$$anon$2@2
                                                  //| 9d322a6
  
  
  kaczkaLesna.kwacz                               //> res6: String = kwacze szybko i normalnie
  kaczkaLesna.lec                                 //> res7: String = lece bo chce
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