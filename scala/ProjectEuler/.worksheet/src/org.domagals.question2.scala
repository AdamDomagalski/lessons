package org.domagals

object question2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(64); 
  println("question 2");$skip(35); 

  val upperBorder: Long = 4000000;System.out.println("""upperBorder  : Long = """ + $show(upperBorder ));$skip(26); 
  val list = 1 to 4000000;System.out.println("""list  : scala.collection.immutable.Range.Inclusive = """ + $show(list ));$skip(145); 


  def fib3(foo: List[Long]): List[Long] = {
    val result = foo.head + foo.tail.head
    if (result < upperBorder) result :: foo else foo
  };System.out.println("""fib3: (foo: List[Long])List[Long]""");$skip(41); 

  var foo: List[Long] = 1L :: 1L :: Nil;System.out.println("""foo  : List[Long] = """ + $show(foo ));$skip(37); 
  list.foreach(x => foo = fib3(foo));$skip(42); 

  val foo2 = foo.filter(b => b % 2 == 0);System.out.println("""foo2  : List[Long] = """ + $show(foo2 ));$skip(11); val res$0 = 
  foo2.sum;System.out.println("""res0: Long = """ + $show(res$0))}
  
}
