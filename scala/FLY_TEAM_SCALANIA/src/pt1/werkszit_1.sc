object werkszit_1 {
  println("24 May 2014")                          //> 24 May 2014
  
  
	//var lista =FlyElem(2,FlyElem(1,FlyNil()))
  
  val lista =FlyList(1,2,3)                       //> lista  : FlyList[Int] = FlyElem(1,FlyElem(2,FlyElem(3,FlyNil())))
  
}

sealed trait FlyList[Int]
case class FlyNil extends FlyList[Int]
case class FlyElem(head:Int,tail:FlyList[Int]) extends FlyList[Int]

object FlyList{

	def apply(elems:Int*):FlyList[Int]=elems.foldRight(FlyNil():FlyList[Int])((elem,result)=>FlyElem(elem,result))
}