package funproginsca

object exercise2_4 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def uncurry[A, B, C](f: A => B => C): (A, B) => C = {
    (a: A, b: B) => f(a)(b)
  }                                               //> uncurry: [A, B, C](f: A => (B => C))(A, B) => C

}