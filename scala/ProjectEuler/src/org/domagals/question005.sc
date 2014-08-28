package org.domagals

object question5 {
  println(
  "2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder."+
  "What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?")
                                                  //> 2520 is the smallest number that can be divided by each of the numbers from 
                                                  //| 1 to 10 without any remainder.What is the smallest positive number that is e
                                                  //| venly divisible by all of the numbers from 1 to 20?



val numbersToTest= Stream.iterate(2520)(arg=>arg+1)
                                                  //> numbersToTest  : scala.collection.immutable.Stream[Int] = Stream(2520, ?)
val devidables  = 2 to 17                         //> devidables  : scala.collection.immutable.Range.Inclusive = Range(2, 3, 4, 5,
                                                  //|  6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17)

def confirmsExpectations(a:Int):Boolean = {
	val results = devidables.filter(x => a%x ==0)
	results.equals(devidables)
}                                                 //> confirmsExpectations: (a: Int)Boolean

def foo(a:Int):Boolean = {
	var foundIt:Boolean = true;
	devidables.foreach(x=> foundIt = foundIt && a%x ==0 )
	foundIt
}                                                 //> foo: (a: Int)Boolean\
	//val isIt = confirmsExpectations(6)
	a
	//java.lang.OutOfMemoryError: GC overhead limit exceeded
	//numbersToTest.foreach(x => if(foo(x)){println("found it: "+x)})
  
  // out of memory
	numbersToTest.filter(confirmsExpectations(_)).foreach(x =>println("znalazłem: "+ x))
}