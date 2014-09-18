package funproginsca

object exercise3_2 {

  //val foo = MyList(1, 2, 3)

  //MyList.sum(foo)

  //MyList.tail(foo)

  //MyList.setHead(2,foo)

  //MyList.drop(foo, 0)

  //  val foo2 = MyList(1, 2, 3, 4 , 5 ,7)
  //	MyList.dropWhile(foo2, (a:Int) => a<4)

  val foo3 = MyList(1, 2, 3, 4, 5, 6, 7, 8)       //> foo3  : funproginsca.MyList.MyList[Int] = MyCons(1,MyCons(2,MyCons(3,MyCons(
                                                  //| 4,MyCons(5,MyCons(6,MyCons(7,MyCons(8,MyNil))))))))
  MyList.init(foo3)                               //> res0: funproginsca.MyList.MyList[Int] = MyCons(1,MyCons(2,MyCons(3,MyCons(4,
                                                  //| MyCons(5,MyCons(6,MyCons(7,MyNil)))))))
}

object MyList {
  sealed trait MyList[+A]
  case object MyNil extends MyList[Nothing]
  case class MyCons[+A](head: A, tail: MyList[A]) extends MyList[A]

  //exercise 3.6
  def init[A](l: MyList[A]): MyList[A] = l match {
    case MyNil => MyNil
    case MyCons(a, MyNil) => MyNil
    case MyCons(a, b) => MyCons(a, init(b))
  }

  //exercise 3.5
  def dropWhile[A](l: MyList[A], f: A => Boolean): MyList[A] = l match {
    case MyNil => MyNil
    case MyCons(a, b) if (f(a) == true) => dropWhile(MyList.tail(l), f)
    case MyCons(a, b) if (f(a) == false) => l
  }

  // exercise 3.4
  def drop[A](l: MyList[A], n: Int): MyList[A] = l match {
    case MyNil => MyNil
    case MyCons(a, b) if (n > 0) => drop(b, n - 1)
    case MyCons(a, b) if (n <= 0) => l
  }

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
  // exercise 3.2
  def tail[A](list: MyList[A]): MyList[A] = list match {
    case MyNil => MyNil
    case MyCons(a, b) => b
  }

  //excercise 3.3
  def setHead[A](newHead: A, list: MyList[A]) = {
    MyCons(newHead, MyList.tail(list))
  }
}