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

  /*
  //3.12
  MyList.revert(MyList(1, 2, 3, 4))
  */

  /*
	//3.14
	val la = MyList(1,2,3,4)
	val lb = MyList(5,6,7,8)
	MyList.append(la, lb)
	MyList.append(la, MyNil)
	
	MyList.append(MyNil,la)
	
	MyList.append(la,MyList())
 	*/

  /*//3.15
 	MyList.megaFold(MyList(la,lb,MyList(11,12)))
	*/

	/*
	//3.16
	val list = List(1,2,3,4,5,11)
	MyList.increase(list)
	*/
	
	/*
	//3.17
	val test3_17 = List(1.1,2.2,3.3)
	MyList.stringer(test3_17);
	*/
	
	/*
	//3.18
	val test3_18 = MyList(1,2,3,4)
	MyList.map(test3_18)(a => a+3)
	*/
	/*
	//3.19
	val test3_19 = MyList(3,7,5,88,1,15)
	MyList.filter(test3_19)(_%2 ==0)
	*/
	
	/*
	//3.20
	MyList.flatMap(MyList(1,2,3))(i => MyList(i,i))
  */
  
	/*
	//3.21
	val asd =MyList(1,2,3,4,5)
	MyList.flatMapFilter(asd)(a=> a>3)
	*/
	
	/*
	//3.22
	val one = MyList(1,2,3,4)
	val two = MyList(4,5,6,7)
	
	MyList.uberAder(one, two) ((a,b)=>a+b)
  */
	
}

object MyList {
  sealed trait MyList[+A]
  case object MyNil extends MyList[Nothing]
  case class MyCons[+A](head: A, tail: MyList[A]) extends MyList[A]


	//3.22
	def uberAder[A,B](list1:MyList[A],list2:MyList[A])(f: (A,A) => A):MyList[A] = (list1,list2) match {
	case (MyCons(a,b),MyCons(c,d)) => MyCons(f(a,c),uberAder(b,d)(f))
	case (MyNil,MyCons(a,b)) => MyCons(a,b)
	case (MyCons(a,b),MyNil) => MyCons(a,b)
	case (MyNil,MyNil) => MyNil
	
	}

	//3.21
	def flatMapFilter[A](list:MyList[A])(f: A => Boolean):MyList[A] = {
		flatMap(list) (a => if(f(a)) MyList(a) else MyNil)
	}


	//3.20
	def flatMap[A,B](as: MyList[A])(f: A => MyList[B]): MyList[B] ={
	val temp = foldRight(as,MyList[MyList[B]]())((item,list) => MyCons(f(item),list))
	megaFold(temp)
	}
	

	//3.19
	def filter[A](as: MyList[A])(f: A => Boolean): MyList[A] = {
	foldRight(as,MyList[A]())((item,list)=> if(f(item)) MyCons(item,list) else list)
	}

	//3.18
	def map[A,B](as: MyList[A])(f: A => B): MyList[B] = {
	   foldRight(as,MyList[B]())((item,list)=>MyCons(f(item),list))
	}
	
	//3.17
	def stringer(l:List[Double]):List[String] = l.map(_.toString)
	
	//3.16
	def increase(l:List[Int]):List[Int] = l.map(_+1)

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
  (list,item) => MyCons(item,list))

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