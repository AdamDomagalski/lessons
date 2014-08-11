package pt15

object pt1 {
  println("11.08.2014 poprzednich dwóch(trzech?) nie mam bo mnie nie było :P")
                                                  //> 11.08.2014 poprzednich dwóch(trzech?) nie mam bo mnie nie było :P


val list = List(1,2,3,4,5)                        //> list  : List[Int] = List(1, 2, 3, 4, 5)
import Modulik._


implicit val intmonoid = IntMonoid                //> intmonoid  : pt15.Modulik.IntMonoid.type = pt15.Modulik$IntMonoid$@2c2dc991

sum(list)                                         //> res0: Int = 15
sum(list)(MultiMonoid)                            //> res1: Int = 120
list.sum                                          //> res2: Int = 15

val list2 = List("aaa","bbb","ccc")               //> list2  : List[String] = List(aaa, bbb, ccc)

implicit val stringMonoid = StringMonoid          //> stringMonoid  : pt15.Modulik.StringMonoid.type = pt15.Modulik$StringMonoid$@
                                                  //| 262e9e80
sum(list2)                                        //> res3: String = aaabbbccc


}

object Modulik{
	def sum[A](xs:List[A])(implicit m:Monoid[A])={xs.foldLeft(m.zero)(m.operacja)}

	trait Monoid[A]{
		def zero:A
		def operacja(a:A,b:A):A
	}
	
	object IntMonoid extends Monoid[Int]{
		override def zero = 0
		override def operacja(a:Int,b:Int) = a+b
	}

object MultiMonoid extends Monoid[Int]{
		override def zero = 1
		override def operacja(a:Int,b:Int) = a*b
	}

	object StringMonoid extends Monoid[String]{
		override def zero = ""
		override def operacja(a:String,b:String)=a+b
	}
}