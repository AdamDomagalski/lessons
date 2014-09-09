package pt017

object pt1 {
  println("4.09.2014 training from programing functional in scala")
                                                  //> 4.09.2014 training from programing functional in scala
  import WstepCwiczenia._

  def add(a: Int, b: Int) = a + b                 //> add: (a: Int, b: Int)Int
  val result = partial1(7, add)                   //> result  : Int => Int = <function1>
  result(1)                                       //> res0: Int = 8
}

object WstepCwiczenia {
  def partial1[A, B, C](a: A, f: (A, B) => C): B => C = f(a, _)
}