package pt8

object pt3 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

// fibonaczi
import Stream._

//val stream = Stream.from(0).map(_*2)
lazy val stream:Stream[Int] = 1#:: 1 #:: stream.zip(stream.tail).map(arg=>{println(arg);arg._1+arg._2})
                                                  //> stream: => Stream[Int]
stream(0)                                         //> res0: Int = 1
stream(1)                                         //> res1: Int = 1
stream(2)                                         //> (1,1)
                                                  //| res2: Int = 2
stream(3)                                         //> (1,2)
                                                  //| res3: Int = 3
stream(4)                                         //> (2,3)
                                                  //| res4: Int = 5

stream(5)                                         //> (3,5)
                                                  //| res5: Int = 8
                                                  
                                                  
                                                  
val lista = List(1,2,3)                           //> lista  : List[Int] = List(1, 2, 3)
lista.zip(lista.tail)                             //> res6: List[(Int, Int)] = List((1,2), (2,3))
}