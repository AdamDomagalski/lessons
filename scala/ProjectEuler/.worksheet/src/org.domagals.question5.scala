package org.domagals

object question5 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(266); 
  println(
  "2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder."+
  "What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?");$skip(55); 



val numbersToTest= Stream.iterate(2520)(arg=>arg+1);System.out.println("""numbersToTest  : scala.collection.immutable.Stream[Int] = """ + $show(numbersToTest ));$skip(26); 
val devidables  = 2 to 17;System.out.println("""devidables  : scala.collection.immutable.Range.Inclusive = """ + $show(devidables ));$skip(122); 

def confirmsExpectations(a:Int):Boolean = {
	val results = devidables.filter(x => a%x ==0)
	results.equals(devidables)
};System.out.println("""confirmsExpectations: (a: Int)Boolean""");$skip(123); 

def foo(a:Int):Boolean = {
	var foundIt:Boolean = true;
	devidables.foreach(x=> foundIt = foundIt && a%x ==0 )
	foundIt
};System.out.println("""foo: (a: Int)Boolean""");$skip(273); 
	//val isIt = confirmsExpectations(6)
	
	//java.lang.OutOfMemoryError: GC overhead limit exceeded
	//numbersToTest.foreach(x => if(foo(x)){println("found it: "+x)})
  
  // out of memory
	numbersToTest.filter(confirmsExpectations(_)).foreach(x =>println("znalazłem: "+ x))}
}
