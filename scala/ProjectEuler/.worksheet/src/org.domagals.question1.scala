package org.domagals

object question1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(86); 
  println("Welcome to the Scala worksheeeet");$skip(26); 
  
  val lista = 1 to 999;System.out.println("""lista  : scala.collection.immutable.Range.Inclusive = """ + $show(lista ));$skip(72); 
  
  
  val suma = lista.filter(e => e%3==0 || e%5==0).foldLeft(0)(_+_);System.out.println("""suma  : Int = """ + $show(suma ));$skip(16); 
  println(suma)}
  
}
