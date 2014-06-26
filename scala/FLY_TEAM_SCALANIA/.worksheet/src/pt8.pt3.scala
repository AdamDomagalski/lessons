package pt8

object pt3 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(69); 
  println("Welcome to the Scala worksheet")

// fibonaczi
import Stream._;$skip(174); 

//val stream = Stream.from(0).map(_*2)
lazy val stream:Stream[Int] = 1#:: 1 #:: stream.zip(stream.tail).map(arg=>{println(arg);arg._1+arg._2});System.out.println("""stream: => Stream[Int]""");$skip(10); val res$0 = 
stream(0);System.out.println("""res0: Int = """ + $show(res$0));$skip(10); val res$1 = 
stream(1);System.out.println("""res1: Int = """ + $show(res$1));$skip(10); val res$2 = 
stream(2);System.out.println("""res2: Int = """ + $show(res$2));$skip(10); val res$3 = 
stream(3);System.out.println("""res3: Int = """ + $show(res$3));$skip(10); val res$4 = 
stream(4);System.out.println("""res4: Int = """ + $show(res$4));$skip(11); val res$5 = 

stream(5);System.out.println("""res5: Int = """ + $show(res$5));$skip(177); 
                                                  
                                                  
                                                  
val lista = List(1,2,3);System.out.println("""lista  : List[Int] = """ + $show(lista ));$skip(22); val res$6 = 
lista.zip(lista.tail);System.out.println("""res6: List[(Int, Int)] = """ + $show(res$6))}
}
