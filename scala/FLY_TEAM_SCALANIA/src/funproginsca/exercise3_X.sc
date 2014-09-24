package funproginsca

object exercise3_X {
  import MyList._
  //val foo = MyList(1, 2, 3)

  //MyList.sum(foo)

  //MyList.tail(foo)

  //MyList.setHead(2,foo)

  //MyList.drop(foo, 0)

  //  val foo2 = MyList(1, 2, 3, 4 , 5 ,7)
  //	MyList.dropWhile(foo2, (a:Int) => a<4)

  //val foo3 = MyList(1, 2, 3, 4, 5, 6, 7, 8)
  //MyList.init(foo3)
  //exercise 3.8

  //MyList.foldRight(MyList(1,2,3), MyNil:MyList[Int])(MyCons(_,_))

  //exercise 3.9
  //MyList.foldRight(foo3, 0)((a,b)=>b+1)

  //exercise 3.10

  //3.12
  MyList.revert(MyList(1, 2, 3, 4))               //> res0: funproginsca.MyList.MyList[Int] = MyCons(4,MyNil)

  /*
	//3.13
	val la = MyList(1,2,3,4)
	val lb = MyList(5,6,7,8)
	MyList.append(la, lb)
	MyList.append(la, MyNil)
	
	MyList.append(MyNil,la)
	
	MyList.append(la,MyList())
 	*/

  /*//3.14
 	MyList.megaFold(MyList(la,lb,MyList(11,12)))
	*/

}

object MyList {
  sealed trait MyList[+A]
  case object MyNil extends MyList[Nothing]
  case class MyCons[+A](head: A, tail: MyList[A]) extends MyList[A]

  //3.15
  def megaFold[A](baselist: MyList[MyList[A]]): MyList[A] = {
    foldRight(baselist, MyList[A]())((item, list) => append(item, list))
  }

  //3.14
  def append[A](a: MyList[A], b: MyList[A]): MyList[A] = (a, b) match {
    case (MyNil, z) => z
    case (z, MyNil) => z
    case (MyCons(x, MyNil), z) => MyCons(x, z)
    case (MyCons(x, y), z) => MyCons(x, append(y, z))
  }

  // exercise 3.12
  def revert[A](a: MyList[A]) =
  foldLeft(a, MyList[A]())(
  (list, item) =>
  setHead(item, list))

  // exercise 3.10
  def foldLeft[A, B](as: MyList[A], z: B)(f: (B, A) => B): B = as match {
    case MyNil => z
    case MyCons(h, t) => foldLeft(t, f(z, h))(f)
  }

  def foldRight[A, B](as: MyList[A], z: B)(f: (A, B) => B): B =
    as match {
      case MyNil => z
      case MyCons(x, xs) => f(x, foldRight(xs, z)(f))
    }

  def sum2(ns: MyList[Int]) =
    foldRight(ns, 0)((x, y) => x + y)

  def product2(ns: MyList[Double]) =
    foldRight(ns, 1.0)(_ * _)

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