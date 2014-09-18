package funproginsca

object exercise2_4 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def compose[A, B, C](f: B => C, g: A => B): A => C = {
    a: A => f(g(a))
  }                                               //> compose: [A, B, C](f: B => C, g: A => B)A => C
}