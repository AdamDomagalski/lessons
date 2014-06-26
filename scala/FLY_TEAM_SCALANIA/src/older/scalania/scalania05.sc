object scalania05 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet




def metoda(a:Int)(b:Int) = a+b                    //> metoda: (a: Int)(b: Int)Int

metoda(1)(2)                                      //> res0: Int = 3

val dodajDoJeden = metoda(1) _                    //> dodajDoJeden  : Int => Int = <function1>

dodajDoJeden(3)                                   //> res1: Int = 4



// policzyć sumę kwadratów nieparzysytych
val lista = List(1,2,3,4,5)                       //> lista  : List[Int] = List(1, 2, 3, 4, 5)



lista.filter(element =>element%2==1).map(elem=>elem*elem).reduce((sum,elem)=>sum+elem)
                                                  //> res2: Int = 35
lista.filter(element =>element%2==1).map(elem=>elem*elem).reduce(_+_)
                                                  //> res3: Int = 35

lista.filter(_%2==1).map(elem=>elem*elem).reduce(_+_)
                                                  //> res4: Int = 35
 
case class User(imie:String,age:Int)
lista.map(wiek=>User("Roman",wiek))               //> res5: List[scalania05.User] = List(User(Roman,1), User(Roman,2), User(Roman,
                                                  //| 3), User(Roman,4), User(Roman,5))



case class Zakup(firma:String,suma:Int)

val zakupy = List(Zakup("TomTom",30),Zakup("Micro",20),Zakup("TomTom",50))
                                                  //> zakupy  : List[scalania05.Zakup] = List(Zakup(TomTom,30), Zakup(Micro,20), Z
                                                  //| akup(TomTom,50))

val aaa = zakupy.filter(record =>record.firma == "TomTom")
                                                  //> aaa  : List[scalania05.Zakup] = List(Zakup(TomTom,30), Zakup(TomTom,50))
aaa.map(_.suma).reduce(_+_)                       //> res6: Int = 80

//lazy init
zakupy.view.filter(_.firma=="TomTom")             //> res7: scala.collection.SeqView[scalania05.Zakup,List[scalania05.Zakup]] = Se
                                                  //| qViewF(...)




//--------------- suma wszystkich nieparzystych liczb z zakresu 1 - 100
val lis = 1 to 100 toList                         //> lis  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 1
                                                  //| 6, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 3
                                                  //| 5, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 5
                                                  //| 4, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 7
                                                  //| 3, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 9
                                                  //| 2, 93, 94, 95, 96, 97, 98, 99, 100)


var aaab = lis.filter(_%2!=0).reduce(_+_)         //> aaab  : Int = 2500
}