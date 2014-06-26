package pt8

object pt4 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

	//silnia

	lazy val stream:Stream[Int] = 1#::  stream.zipWithIndex.map(arg=>{println(arg);arg._1*(arg._2+1)})
                                                  //> stream: => Stream[Int]


stream(0)                                         //> res0: Int = 1
stream(1)                                         //> (1,0)
                                                  //| res1: Int = 1
stream(2)                                         //> (1,1)
                                                  //| res2: Int = 2
stream(3)                                         //> (2,2)
                                                  //| res3: Int = 6
stream(4)                                         //> (6,3)
                                                  //| res4: Int = 24

}