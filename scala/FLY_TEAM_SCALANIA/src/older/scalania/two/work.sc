object work {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def dodaj(elem: Int) = elem + 1                 //> dodaj: (elem: Int)Int

  dodaj(2)                                        //> res0: Int = 3
  // wywoływanie funkcji na liście
  List(1, 2, 3, 4, 5).map(_ + 1)                  //> res1: List[Int] = List(2, 3, 4, 5, 6)

  // tworzenie listy poprzez konkatenacje
  val list = 1 :: 2 :: 3 :: 4 :: 5 :: Nil         //> list  : List[Int] = List(1, 2, 3, 4, 5)
  0 :: list                                       //> res2: List[Int] = List(0, 1, 2, 3, 4, 5)

  val lista2 = 1 to 4                             //> lista2  : scala.collection.immutable.Range.Inclusive = Range(1, 2, 3, 4)

  list match {
    case head :: tail => tail
    case head :: second :: tail => tail
  }                                               //> res3: List[Int] = List(2, 3, 4, 5)
  
  
//suma listy java style
var suma =0                                       //> suma  : Int = 0
for(element <-list){
	suma=suma+element
}

 suma                                             //> res4: Int = 15


def sumuj(lista:List[Int]):Int= lista match{
 case head::Nil =>head
 case head::tail => head + sumuj(tail)
 case _ => 0
}                                                 //> sumuj: (lista: List[Int])Int

sumuj(list)                                       //> res5: Int = 15


// sumowanie z tail recursive, odporne na stack overflow
def sumuj2(acc:Int,lista:List[Int]):Int= lista match{
 case head::Nil =>acc+head
 case head::tail => sumuj2(acc+head,tail)
 case _ => 0
}                                                 //> sumuj2: (acc: Int, lista: List[Int])Int

sumuj2(0,list)                                    //> res6: Int = 15


//suma robiona fold leftem
list.foldLeft(0)((acc:Int,element:Int)=>acc+element)
                                                  //> res7: Int = 15

list.foldLeft(0)(_+_)                             //> res8: Int = 15



}