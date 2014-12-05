package pt020

object p15 {
  println("p15")                                  //> p15
  
  
  def duplicateN[A](n:Int,list:List[A]):List[A] = {
	
	list.flatMap(List.fill(n)(_))
	}                                         //> duplicateN: [A](n: Int, list: List[A])List[A]
  duplicateN(4,List(1,2,3,4))                     //> res0: List[Int] = List(1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4)
}