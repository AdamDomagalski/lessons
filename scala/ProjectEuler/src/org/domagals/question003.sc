package org.domagals

object question003 {
  println("The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime factor of the number 600851475143 ?")
                                                  //> The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime fa
                                                  //| ctor of the number 600851475143 ?

  val basicDeviders:List[Long] = (2L to 9L).toList//> basicDeviders  : List[Long] = List(2, 3, 4, 5, 6, 7, 8, 9)
  var knownPrimes:List[Long] = List(3,7)          //> knownPrimes  : List[Long] = List(3, 7)
  

	def isDevidableBy(deviderList:List[Long],numberToTest:Long):Boolean = {
  	deviderList.foldLeft(false)((stack,elem)=>numberToTest%elem == 0 || stack)
  }                                               //> isDevidableBy: (deviderList: List[Long], numberToTest: Long)Boolean
  
  isDevidableBy(List(3L,7L,11L), 29)              //> res0: Boolean = false
  
  isDevidableBy(basicDeviders, 2)                 //> res1: Boolean = true
  isDevidableBy(basicDeviders, 3)                 //> res2: Boolean = true
  isDevidableBy(basicDeviders, 4)                 //> res3: Boolean = true
  isDevidableBy(basicDeviders, 5)                 //> res4: Boolean = true
  isDevidableBy(basicDeviders, 6)                 //> res5: Boolean = true
  isDevidableBy(basicDeviders, 7)                 //> res6: Boolean = true
  isDevidableBy(basicDeviders, 8)                 //> res7: Boolean = true
  isDevidableBy(basicDeviders, 9)                 //> res8: Boolean = true
  isDevidableBy(basicDeviders, 11)                //> res9: Boolean = false
  isDevidableBy(basicDeviders, 2*3*4*5*6*7*8*9)   //> res10: Boolean = true
  
  def foo(numberToTest:Long){
  	if(!isDevidableBy(basicDeviders, numberToTest)){
  		if(!isDevidableBy(knownPrimes, numberToTest)){
  			knownPrimes = numberToTest::knownPrimes
  		}
  	}
  }                                               //> foo: (numberToTest: Long)Unit
  
val max:Long = 600851475143L                      //> max  : Long = 600851475143
//val max:Long = 300
val border:Long = Math.sqrt(max).toLong           //> border  : Long = 775146
(2L to border).foreach(foo(_) )
	
println(knownPrimes)                              //> List(775121, 775097, 775091, 775087, 775079, 775063, 775057, 775043, 775037
                                                  //| , 775007, 774997, 774959, 774931, 774929, 774919, 774901, 774863, 774857, 7
                                                  //| 74853, 774833, 774821, 774811, 774803, 774799, 774797, 774791, 774779, 7747
                                                  //| 73, 774757, 774733, 774703, 774691, 774679, 774671, 774667, 774661, 774643,
                                                  //|  774629, 774601, 774593, 774589, 774583, 774577, 774551, 774541, 774523, 77
                                                  //| 4511, 774491, 774467, 774463, 774439, 774427, 774377, 774343, 774337, 77431
                                                  //| 7, 774313, 774289, 774283, 774239, 774233, 774229, 774223, 774217, 774199, 
                                                  //| 774181, 774173, 774161, 774149, 774143, 774133, 774131, 774127, 774119, 774
                                                  //| 107, 774083, 774073, 774071, 774047, 774023, 774017, 774001, 773999, 773989
                                                  //| , 773987, 773953, 773951, 773939, 773933, 773909, 773897, 773879, 773869, 7
                                                  //| 73867, 773863, 773849, 773837, 773831, 773821, 773803, 773779, 773777, 7737
                                                  //| 67, 773723, 773719, 773713, 773693, 773683, 773681, 773659, 773657, 773611,
                                                  //|  773609, 773603, 773599
                                                  //| Output exceeds cutoff limit.
                                                  
/*
List(775121, 775097, 775091, 775087, 775079, 775063, 775057, 775043, 775037
*/
}