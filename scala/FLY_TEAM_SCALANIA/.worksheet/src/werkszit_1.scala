object werkszit_1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(44); 
  println("24 May 2014");$skip(82); 
  
  
	//var lista =FlyElem(2,FlyElem(1,FlyNil()))
  
  val lista =FlyList(1,2,3);System.out.println("""lista  : FlyList[Int] = """ + $show(lista ))}
  
}

sealed trait FlyList[Int]
case class FlyNil extends FlyList[Int]
case class FlyElem(head:Int,tail:FlyList[Int]) extends FlyList[Int]

object FlyList{

	def apply(elems:Int*):FlyList[Int]=elems.foldRight(FlyNil():FlyList[Int])((elem,result)=>FlyElem(elem,result))
}
