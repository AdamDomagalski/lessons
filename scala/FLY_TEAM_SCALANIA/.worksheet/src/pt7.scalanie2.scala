package pt7

object scalanie2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(55); 
  println("16.06.2014");$skip(86); 
  println("zsumowac wszystkie elementy ciagu fibonacziego parzyste mniejsze od 4000");$skip(119); 

	def fibonaczi(elem:Int):Int= elem match{
			case 0 => 1
			case 1 => 1
			case n => fibonaczi(n-1)+fibonaczi(n-2)
	};System.out.println("""fibonaczi: (elem: Int)Int""");$skip(80); 
	
// ograniczone bo komp wysiadał przy takich obliczeniach
 val list  = 1 to 40;System.out.println("""list  : scala.collection.immutable.Range.Inclusive = """ + $show(list ));$skip(45); val res$0 = 
 
 list.map(fibonaczi(_)).filter(_<4000).sum;System.out.println("""res0: Int = """ + $show(res$0))}
}
