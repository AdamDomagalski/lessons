object info {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet


def podziel(a:Int,b:Int) = b match{
	case 0 => throw new IllegalArgumentException
	case _ =>a/b
	}                                         //> podziel: (a: Int, b: Int)Int


//podziel(1,0)
            
def podziel2(a:Int,b:Int) = b match{
	case 0 => None
	case _ =>Some(a/b)
	}                                         //> podziel2: (a: Int, b: Int)Option[Int]


podziel2(1,0)                                     //> res0: Option[Int] = None
            
val wynikOption = podziel2(6,2)                   //> wynikOption  : Option[Int] = Some(3)
            
wynikOption.getOrElse("ne ma")                    //> res1: Any = 3


def czystaFunkcja(a:Int) = a+1                    //> czystaFunkcja: (a: Int)Int
//val rezultatDoPierscienia = wynikOption.map(czystaFunkcja)

val rezultatDoPierscienia = wynikOption.map(czystaFunkcja).filter(_>3)
                                                  //> rezultatDoPierscienia  : Option[Int] = Some(4)
}