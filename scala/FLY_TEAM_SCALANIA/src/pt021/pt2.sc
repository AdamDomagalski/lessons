package pt021

object pt2 {
  println("99 scala problems 18")                 //> 99 scala problems 18

	def slice[A](start:Int,end:Int,l:List[A]):List[A] = {
			if(start < end && start > 0 && end > 0){
				l.drop(start-1).diff(l.takeRight(l.size-(end-1)))
			}else {
				List()
			}
	}                                         //> slice: [A](start: Int, end: Int, l: List[A])List[A]
	
	
	slice(3,7,List(1,2,3,4,5,6,7,8,9,10))     //> res0: List[Int] = List(3, 4, 5, 6)

}