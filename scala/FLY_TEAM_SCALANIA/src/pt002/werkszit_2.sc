object werkszit_2 {
  println("24 may 2014")                          //> 24 may 2014
  
  
  val lista =FlyList(6,2,3)                       //> lista  : FlyList = FlyElem(6,FlyElem(2,FlyElem(3,FlyNil())))
  lista.foreach(print)                            //> res0: Int = 6
}

sealed trait FlyList{
	 //def foreach(fun:Int=>Unit) = this.foldRight(FlyNil():FlyList[Int])((elem:FlyElem,resutlt)=>fun(elem));
	def foreach(fun:Int=>Unit) = this match {
		case FlyNil() => 1
		case FlyElem(head,any) => head
	}
}
case class FlyNil extends FlyList
case class FlyElem(head:Int,tail:FlyList) extends FlyList

object FlyList{

	def apply(elems:Int*):FlyList=elems.foldRight(FlyNil():FlyList)((elem,result)=>FlyElem(elem,result))
}