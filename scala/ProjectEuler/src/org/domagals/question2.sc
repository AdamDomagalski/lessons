package org.domagals

object question2 {
  println("question 2")
  
//  def fib(a:Int):Int = a match{
//  	case 0 => 1
//  	case 1 => 1
//  	case _ => (fib(a-1) + fib(a-2))
//  }
 
  val list = 1 to 4000000
  
//  def fib2(a:List[Int]):List[Int] = a match{
//  	case List() => 1::a
//  	case _::Nil => 1::a
//  	case _ => (a.head + a.tail.head) :: a
//  }
  
  def fib3(foo:List[Long]):List[Long]asdasd ={
  (foo.head + foo.tail.head) ::foo
  }
  
  

  var foo:List[Long] = 1L::1L::Nil
  list.foreach(x => foo = fib3(foo))
  
  foo.filter(b=> b<4000000 && b%2==0)
  
  
  
 
  
  //list map(fib(_)) filter(a=> a<4000000 && a%2 ==0  ) sum
}