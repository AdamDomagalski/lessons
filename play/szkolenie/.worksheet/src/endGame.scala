object endGame {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(60); 
  println("Welcome to the Scala worksheet");$skip(34); 
  
  val dupa = Dupa.apply("aaa");System.out.println("""dupa  : Dupa = """ + $show(dupa ));$skip(14); val res$0 = 
  dupa.string;System.out.println("""res0: String = """ + $show(res$0));$skip(32); 
  
  val dupa2 =new Dupa("bbb");System.out.println("""dupa2  : Dupa = """ + $show(dupa2 ));$skip(15); val res$1 = 
  dupa2.string;System.out.println("""res1: String = """ + $show(res$1))}
}


	class Dupa(val string:String)

  object Dupa{
  	def apply(string:String)=new Dupa(string)
  }
