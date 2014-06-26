object werkszit_2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(44); 
  println("24 may 2014");$skip(34); 
  
  
  val lista =FlyList(6,2,3);System.out.println("""lista  : FlyList = """ + $show(lista ));$skip(23); val res$0 = 
  lista.foreach(print);System.out.println("""res0: Int = """ + $show(res$0))}
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
