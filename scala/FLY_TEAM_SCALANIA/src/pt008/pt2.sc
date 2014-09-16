package pt8

object pt2 {
  println("scalania 26.06.2014")                  //> scalania 26.06.2014

	import Stream._
	
	
	//val stream= Stream.iterate(1)(arg=>arg+1)
	//val stream= Stream.iterate(10)(arg=>arg+1)
	val stream= Stream.iterate("")(arg=>arg+" ** ")
                                                  //> stream  : scala.collection.immutable.Stream[String] = Stream(, ?)

	stream(0)                                 //> res0: String = ""
	stream(1)                                 //> res1: String = " ** "
	stream(2)                                 //> res2: String = " **  ** "
	stream(3)                                 //> res3: String = " **  **  ** "
	stream(10)                                //> res4: String = " **  **  **  **  **  **  **  **  **  ** "
	
	
	
}