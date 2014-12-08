package pt021

object pt1 {
  println("99 scala problems 17")                 //> 99 scala problems 17




def split[A](at:Int,l1:List[A]):(List[A],List[A]) = {
	(l1.diff(l1.takeRight(l1.size - at)),l1.takeRight(l1.size - at))

	}                                         //> split: [A](at: Int, l1: List[A])(List[A], List[A])

split(1,List(1,2,3,4,5))                          //> res0: (List[Int], List[Int]) = (List(1),List(2, 3, 4, 5))
split(2,List(1,2,3,4,5))                          //> res1: (List[Int], List[Int]) = (List(1, 2),List(3, 4, 5))
split(3,List(1,2,3,4,5))                          //> res2: (List[Int], List[Int]) = (List(1, 2, 3),List(4, 5))
split(4,List(1,2,3,4,5))                          //> res3: (List[Int], List[Int]) = (List(1, 2, 3, 4),List(5))
split(5,List(1,2,3,4,5))                          //> res4: (List[Int], List[Int]) = (List(1, 2, 3, 4, 5),List())

}