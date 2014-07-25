package org.domagals

object question2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(64); 
  println("question 2");$skip(142); 
  
//  def fib(a:Int):Int = a match{
//  	case 0 => 1
//  	case 1 => 1
//  	case _ => (fib(a-1) + fib(a-2))
//  }
 
  val list = 1 to 4000000;System.out.println("""list  : scala.collection.immutable.Range.Inclusive = """ + $show(list ));$skip(238); 
  
//  def fib2(a:List[Int]):List[Int] = a match{
//  	case List() => 1::a
//  	case _::Nil => 1::a
//  	case _ => (a.head + a.tail.head) :: a
//  }
  
  def fib3(foo:List[Long]):List[Long]asdasd ={
  (foo.head + foo.tail.head) ::foo
  };System.out.println("""fib3: (foo: List[Long])<error>""");$skip(42); 
  
  

  var foo:List[Long] = 1L::1L::Nil;System.out.println("""foo  : List[Long] = """ + $show(foo ));$skip(37); 
  list.foreach(x => foo = fib3(foo));$skip(41); val res$0 = 
  
  foo.filter(b=> b<4000000 && b%2==0);System.out.println("""res0: List[Long] = """ + $show(res$0))}
  
  
  
 
  
  //list map(fib(_)) filter(a=> a<4000000 && a%2 ==0  ) sum
}
