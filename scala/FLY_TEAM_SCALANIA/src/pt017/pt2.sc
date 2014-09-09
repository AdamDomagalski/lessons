package pt017

object pt2 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

	import Cur._
	def add(a:Int,b:Int) = a+b                //> add: (a: Int, b: Int)Int
	val result = curry(add)                   //> result  : Int => (Int => Int) = <function1>
	result(7)                                 //> res0: Int => Int = <function1>
	result(7)(1)                              //> res1: Int = 8
}


object Cur{

	def curry[A,B,C](f: (A, B) => C): A => (B => C)=
		//(a:A) =>(b:B) => f(a,b)
		// uproszczone
		a => b => f(a,b)
		
		
		def uncurry[A,B,C](f: A => B => C): (A, B) => C ={
		(a:A,b:B)=>f(a)(b)
		}
}