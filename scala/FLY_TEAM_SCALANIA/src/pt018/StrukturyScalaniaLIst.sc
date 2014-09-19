package pt018

object StrukturyScalaniaLIst {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  val foo = MyList(1, 2, 3)                       //> foo  : pt018.MyList.MyList[Int] = MyCons(1,MyCons(2,MyCons(3,MyNil)))

  MyList.sum(foo)                                 //> res0: Int = 6

  MyList.product(MyList(1.1, 2.2, 3.3))           //> res1: Double = 7.986000000000001

  MyList.tail(foo)                                //> res2: pt018.MyList.MyList[Int] = MyCons(2,MyCons(3,MyNil))

  MyList.tail(MyList())                           //> res3: pt018.MyList.MyList[Nothing] = MyNil

  MyList.drop(foo, 2)                             //> res4: pt018.MyList.MyList[Int] = MyCons(3,MyNil)
}

object MyList {
  sealed trait MyList[+A]
  case object MyNil extends MyList[Nothing]
  case class MyCons[+A](head: A, tail: MyList[A]) extends MyList[A]

  def apply[A](as: A*): MyList[A] = {
    if (as.isEmpty) MyNil
    // : _* zamiast przesłać listę 7 elementów prześle 7 elementów
    else MyCons(as.head, apply(as.tail: _*))
  }

  def sum(ints: MyList[Int]): Int = ints match {
    case MyCons(a, MyNil) => a
    case MyCons(a, b) => a + sum(b)
    case MyNil => 0
  }

  def product(ds: MyList[Double]): Double = ds match {
    case MyNil => 0.0
    case MyCons(a, MyNil) => a
    case MyCons(a, b) => a * product(b)
  }

  def tail[A](l: MyList[A]): MyList[A] = l match {
    case MyNil => MyNil
    case MyCons(a, MyNil) => MyNil
    case MyCons(a, b) => b
  }

  def drop[A](l: MyList[A], n: Int): MyList[A] = (l, n) match {
    case (l, 0) => l
    case (MyCons(_, t), n) => drop(t, n - 1)
  }

  def foldRight[A, B](as: MyList[A], z: B)(f: (A, B) => B): B = as match {
    case MyNil => z
    case MyCons(h, t) => f(h, foldRight(t, z)(f))
  }

  def sum_fold_right(l: MyList[Int]) = foldRight(l, 0)((a, b) => a + b)
  def product_fold_right(l: MyList[Double]) = foldRight(l, 1.0)((a, b) => a * b)

}