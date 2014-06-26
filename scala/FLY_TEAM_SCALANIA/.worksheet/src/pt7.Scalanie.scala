package pt7

object Scalanie {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(54); 
  println("16.06.2014");$skip(64); 
  println("zsumowac wszystkie liczby niepodzielne przez 3 i 5");$skip(23); 
  val list = 1 to 1000;System.out.println("""list  : scala.collection.immutable.Range.Inclusive = """ + $show(list ));$skip(90); 
  
  
  def undevidedby(number:Int,devidedBy:Int):Boolean={
  	number %devidedBy != 0
  };System.out.println("""undevidedby: (number: Int, devidedBy: Int)Boolean""");$skip(78); val res$0 = 
  
  list.filter(undevidedby(_,3)).filter(undevidedby(_, 5)).foldLeft(0)(_+_);System.out.println("""res0: Int = """ + $show(res$0));$skip(113); val res$1 = 
                                                  
  list.filter(n => undevidedby(n,3) && undevidedby(n, 5)).sum;System.out.println("""res1: Int = """ + $show(res$1))}
}
