object next {

  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

//val lista=List(1);

def suma(lista:List[Int]):Int=lista match{
 case Nil => 0
 case head::Nil => head
 case head::tail => head+suma(tail)
}                                                 //> suma: (lista: List[Int])Int

suma(List())                                      //> res0: Int = 0
suma(List(1))                                     //> res1: Int = 1
suma(List(1,2))                                   //> res2: Int = 3
suma(List(1,2,3))                                 //> res3: Int = 6
suma(List(1,2,3,4))                               //> res4: Int = 10
suma(List(1,2,3,4,100))                           //> res5: Int = 110
}

/*sealed trait TrainList[+A]
case object Nil extends TrainList[Nothing]
case class Cons[+A](head: A, tail: TrainList[A]) extends TrainList[A]
object TrainList {
    def apply[A](as: A*): TrainList[A] =
    if (as.isEmpty) Nil
    else Cons(as.head, apply(as.tail: _*))
   
  def sum(ints: TrainList[Int]): Int = ints match {
    case Nil         => 0
    case Cons(x, xs) => x + sum(xs)
  }}*/