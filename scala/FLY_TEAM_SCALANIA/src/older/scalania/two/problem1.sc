object problem1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val lista = List(1,1,2,2,3,3,4,4,4,4,4,5,5,5,5,5)
                                                  //> lista  : List[Int] = List(1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5)
  
  
  
  def sprawdz(lista:List[Int]):Int = lista match{
  case head::Nil => head
  case head::tail => sprawdz(tail)
  case _ => 0
  
  }                                               //> sprawdz: (lista: List[Int])Int
  
  
  sprawdz(lista)                                  //> res0: Int = 5
  // stworzyc mape z kluczami element, ilosc wystapienia
  def oblicz(acc:List[List[Int]],list:List[Int]):List[List[Int]] = list match{
  //case head::tail => acc.foldLeft(List())((_,element)=> element)
  case _ => acc
  
  }                                               //> oblicz: (acc: List[List[Int]], list: List[Int])List[List[Int]]
  
  oblicz(List(List()),lista)                      //> res1: List[List[Int]] = List(List())
}