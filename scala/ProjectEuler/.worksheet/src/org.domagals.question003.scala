package org.domagals

object question003 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(165); 
  println("The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime factor of the number 600851475143 ?");$skip(52); 

  val basicDeviders:List[Long] = (2L to 9L).toList;System.out.println("""basicDeviders  : List[Long] = """ + $show(basicDeviders ));$skip(41); 
  var knownPrimes:List[Long] = List(3,7);System.out.println("""knownPrimes  : List[Long] = """ + $show(knownPrimes ));$skip(159); 
  

	def isDevidableBy(deviderList:List[Long],numberToTest:Long):Boolean = {
  	deviderList.foldLeft(false)((stack,elem)=>numberToTest%elem == 0 || stack)
  };System.out.println("""isDevidableBy: (deviderList: List[Long], numberToTest: Long)Boolean""");$skip(40); val res$0 = 
  
  isDevidableBy(List(3L,7L,11L), 29);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(37); val res$1 = 
  
  isDevidableBy(basicDeviders, 2);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(34); val res$2 = 
  isDevidableBy(basicDeviders, 3);System.out.println("""res2: Boolean = """ + $show(res$2));$skip(34); val res$3 = 
  isDevidableBy(basicDeviders, 4);System.out.println("""res3: Boolean = """ + $show(res$3));$skip(34); val res$4 = 
  isDevidableBy(basicDeviders, 5);System.out.println("""res4: Boolean = """ + $show(res$4));$skip(34); val res$5 = 
  isDevidableBy(basicDeviders, 6);System.out.println("""res5: Boolean = """ + $show(res$5));$skip(34); val res$6 = 
  isDevidableBy(basicDeviders, 7);System.out.println("""res6: Boolean = """ + $show(res$6));$skip(34); val res$7 = 
  isDevidableBy(basicDeviders, 8);System.out.println("""res7: Boolean = """ + $show(res$7));$skip(34); val res$8 = 
  isDevidableBy(basicDeviders, 9);System.out.println("""res8: Boolean = """ + $show(res$8));$skip(35); val res$9 = 
  isDevidableBy(basicDeviders, 11);System.out.println("""res9: Boolean = """ + $show(res$9));$skip(48); val res$10 = 
  isDevidableBy(basicDeviders, 2*3*4*5*6*7*8*9);System.out.println("""res10: Boolean = """ + $show(res$10));$skip(196); 
  
  def foo(numberToTest:Long){
  	if(!isDevidableBy(basicDeviders, numberToTest)){
  		if(!isDevidableBy(knownPrimes, numberToTest)){
  			knownPrimes = numberToTest::knownPrimes
  		}
  	}
  };System.out.println("""foo: (numberToTest: Long)Unit""");$skip(32); 
  
val max:Long = 600851475143L;System.out.println("""max  : Long = """ + $show(max ));$skip(61); 
//val max:Long = 300
val border:Long = Math.sqrt(max).toLong;System.out.println("""border  : Long = """ + $show(border ));$skip(32); 
(2L to border).foreach(foo(_) );$skip(23); 
	
println(knownPrimes)}
                                                  
/*
List(775121, 775097, 775091, 775087, 775079, 775063, 775057, 775043, 775037
*/
}
