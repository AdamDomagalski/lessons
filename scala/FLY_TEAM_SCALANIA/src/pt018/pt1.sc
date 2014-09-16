package pt018

object pt1 {
  println("12 September 2014")                    //> 12 September 2014

  // function compose

  def compose[A, B, C](f: B => C, g: A => B): A => C = {
    a => f(g(a))
  }                                               //> compose: [A, B, C](f: B => C, g: A => B)A => C

}