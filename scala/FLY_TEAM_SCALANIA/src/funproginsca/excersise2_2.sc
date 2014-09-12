package funproginsca

object excersise2_2 {
  println("Excersise 2.2")                        //> Excersise 2.2
  
  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = as match {
  case Array() => false
  case Array(a,b,_*) => if(ordered(a,b)) isSorted(as.tail,ordered)  else false
  case Array(a) => true
  
  }                                               //> isSorted: [A](as: Array[A], ordered: (A, A) => Boolean)Boolean
  
  
  //val num = Array(1,2,7,3,4,5)
  val num = Array(1,2,2,3,4,5)                    //> num  : Array[Int] = Array(1, 2, 2, 3, 4, 5)
  //val num = Array(1,2)
  //val num = Array(2)
  //val num = Array()
  def numCom(a:Int,b:Int)  = a <=b                //> numCom: (a: Int, b: Int)Boolean
  isSorted(num,numCom)                            //> res0: Boolean = true
}