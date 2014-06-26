package pt8

object pt4 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(69); 
  println("Welcome to the Scala worksheet");$skip(112); 

	//silnia

	lazy val stream:Stream[Int] = 1#::  stream.zipWithIndex.map(arg=>{println(arg);arg._1*(arg._2+1)});System.out.println("""stream: => Stream[Int]""");$skip(12); val res$0 = 


stream(0);System.out.println("""res0: Int = """ + $show(res$0));$skip(10); val res$1 = 
stream(1);System.out.println("""res1: Int = """ + $show(res$1));$skip(10); val res$2 = 
stream(2);System.out.println("""res2: Int = """ + $show(res$2));$skip(10); val res$3 = 
stream(3);System.out.println("""res3: Int = """ + $show(res$3));$skip(10); val res$4 = 
stream(4);System.out.println("""res4: Int = """ + $show(res$4))}

}
