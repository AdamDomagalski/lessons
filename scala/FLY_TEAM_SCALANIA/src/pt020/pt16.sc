package pt020

object pt16 {
  println("pt16")                                 //> pt16

	def drop(n:Int,l:List[Int])=
		l.zipWithIndex.filter{case(e,i) => (i+1)%n!=0 }.map(_._1)
                                                  //> drop: (n: Int, l: List[Int])List[Int]

 drop(3, List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)) //> res0: List[Int] = List(1, 2, 4, 5, 7, 8, 10, 11)
}