package pt016

object pt2 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

	def divide (a:Int,b:Int) = a/b            //> divide: (a: Int, b: Int)Int
	
	//stare podejscie
	def divadeSafely(a:Int,b:Int) = {
		try{
			a/b
		}
		catch {
			case e:Exception =>println("Error !!!")
		}
	}                                         //> divadeSafely: (a: Int, b: Int)AnyVal
	
	divadeSafely(1, 0)                        //> Error !!!
                                                  //| res0: AnyVal = ()
	def executeSafely(a:Int,b:Int)(f:(Int,Int)=>Int){
		try{
			f(a,b)
		}
		catch{
			case e:Exception => println("Error while executing!")
		}
	}                                         //> executeSafely: (a: Int, b: Int)(f: (Int, Int) => Int)Unit


executeSafely(1, 0)(divide)                       //> Error while executing!


	def executeSafely2[A](f: =>A) = {
		try{
			f
		}
		catch{
			case e:Exception => println("Error while executing!")
		}
	}                                         //> executeSafely2: [A](f: => A)Any


val resultset = executeSafely2{
	divide(4,2)
}                                                 //> resultset  : Any = 2


executeSafely2{
	divide(1,0)
}                                                 //> Error while executing!
                                                  //| res1: Any = ()

// z generyczna obsluga exceptionow
	def executeSafely3[A](ex: => Unit)(f: =>A) = {
		try{
			f
		}
		catch{
			case e:Exception => ex
		}
	}                                         //> executeSafely3: [A](ex: => Unit)(f: => A)Any


val partial = executeSafely3(println("Error while executing!")) _
                                                  //> partial  : (=> Any) => Any = <function1>

val resultset3 = partial{
	divide(4,2)
}                                                 //> resultset3  : Any = 2


partial{
	divide(1,0)
}                                                 //> Error while executing!
                                                  //| res2: Any = ()

}