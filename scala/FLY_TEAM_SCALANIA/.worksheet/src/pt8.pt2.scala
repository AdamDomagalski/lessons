package pt8

object pt2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(58); 
  println("scalania 26.06.2014")

	import Stream._;$skip(162); 
	
	
	//val stream= Stream.iterate(1)(arg=>arg+1)
	//val stream= Stream.iterate(10)(arg=>arg+1)
	val stream= Stream.iterate("")(arg=>arg+" ** ");System.out.println("""stream  : scala.collection.immutable.Stream[String] = """ + $show(stream ));$skip(12); val res$0 = 

	stream(0);System.out.println("""res0: String = """ + $show(res$0));$skip(11); val res$1 = 
	stream(1);System.out.println("""res1: String = """ + $show(res$1));$skip(11); val res$2 = 
	stream(2);System.out.println("""res2: String = """ + $show(res$2));$skip(11); val res$3 = 
	stream(3);System.out.println("""res3: String = """ + $show(res$3));$skip(12); val res$4 = 
	stream(10);System.out.println("""res4: String = """ + $show(res$4))}
	
	
	
}
