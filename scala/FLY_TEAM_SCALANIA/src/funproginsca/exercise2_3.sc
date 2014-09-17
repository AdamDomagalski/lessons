package funproginsca

object exercise2_3 {
  println("curry")                                //> curry
  
  def curry[A,B,C](f: (A, B) => C): A => (B => C) = {
  	(a:A) => f(a,_)
  }                                               //> curry: [A, B, C](f: (A, B) => C)A => (B => C)
  
}