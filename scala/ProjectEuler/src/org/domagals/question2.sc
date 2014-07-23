package org.domagals

object question2 {
  println("question 2")                           //> question 2
  
  def fib(a:Int):Int = a match{
  	case 0 => 1
  	case 1 => 1
  	case _ => (fib(a-1) + fib(a-2))
  }                                               //> fib: (a: Int)Int
   
  //fib(10)
  //fib(9)
  
  lazy val list = 1 to 4000000                    //> list: => scala.collection.immutable.Range.Inclusive
  val stream = list.toStream                      //> stream  : scala.collection.immutable.Stream[Int] = Stream(1, ?)\
  
  stream map(fib(_)) filter(a=> a<4000000 && a%2 ==0  ) sum
}