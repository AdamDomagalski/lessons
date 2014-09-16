package pt018

object StrukturyScalaniaLIst {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

	val foo = MyList(1,2,3)                   //> foo  : pt018.MyList.MyList[Int] = MyCons(1,MyCons(2,MyCons(3,MyNil)))
 
	MyList.sum(foo)                           //> res0: Int = 6
}

object MyList {
  sealed trait MyList[+A]
  case object MyNil extends MyList[Nothing]
  case class MyCons[+A](head: A, tail: MyList[A]) extends MyList[A]


	def apply[A](as:A*):MyList[A] = {
		if(as.isEmpty) MyNil
		// : _* zamiast przesłać listę 7 elementów prześle 7 elementów
		else MyCons(as.head,apply(as.tail: _*))
	}
	
	def sum(ints: MyList[Int]): Int=ints match{
		case MyCons(a,MyNil) => a
		case MyCons(a,b) => a + sum(b)
		case MyNil => 0
	}
}