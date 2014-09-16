package pt8

object pt1 {
  println("Scalania 26.06.2014")                  //> Scalania 26.06.2014
	
	import Stream._
	
	// tworzenie pustego strumienia
	val stream =1 #:: 2 #::Stream.empty       //> stream  : scala.collection.immutable.Stream[Int] = Stream(1, ?)
	
	stream(0)                                 //> res0: Int = 1
	stream(1)                                 //> res1: Int = 2
	//stream(2) // to rzuci blad
	
	// strumien zawsze zwracajacy ta sama wartosc
	val stream2 = Stream.continually(4)       //> stream2  : scala.collection.immutable.Stream[Int] = Stream(4, ?)
	
	stream2(0)                                //> res2: Int = 4
	stream2(10)                               //> res3: Int = 4
	stream2(20)                               //> res4: Int = 4
	
	
	
	val polaczonyStrumien  = 1#::2#::stream2  //> polaczonyStrumien  : scala.collection.immutable.Stream[Int] = Stream(1, ?)
	
	
	 polaczonyStrumien(0)                     //> res5: Int = 1
	 polaczonyStrumien(1)                     //> res6: Int = 2
	 polaczonyStrumien(30)                    //> res7: Int = 4
	
	
	val strumienParzystych = polaczonyStrumien.filter(_%2==0)
                                                  //> strumienParzystych  : scala.collection.immutable.Stream[Int] = Stream(2, ?)
	
	strumienParzystych(0)                     //> res8: Int = 2
	strumienParzystych(1)                     //> res9: Int = 4
	strumienParzystych(2)                     //> res10: Int = 4
	
}