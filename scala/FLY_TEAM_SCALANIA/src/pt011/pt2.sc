package pt11

object pt2 {
    println("25.06.2014")                         //> 25.06.2014
  
  
  1 to 10 by 3                                    //> res0: scala.collection.immutable.Range = Range(1, 4, 7, 10)
  
  1 until 100                                     //> res1: scala.collection.immutable.Range = Range(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                                                  //|  11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 
                                                  //| 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 4
                                                  //| 9, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68
                                                  //| , 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87,
                                                  //|  88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99)
  
  // lista wielokrotności 7 do 300
  // zwrócić listę kwadratów tych wielokrotności
  
  val seven  = 0 to 300 by 7                      //> seven  : scala.collection.immutable.Range = Range(0, 7, 14, 21, 28, 35, 42, 
                                                  //| 49, 56, 63, 70, 77, 84, 91, 98, 105, 112, 119, 126, 133, 140, 147, 154, 161,
                                                  //|  168, 175, 182, 189, 196, 203, 210, 217, 224, 231, 238, 245, 252, 259, 266, 
                                                  //| 273, 280, 287, 294)
  seven.map(x=>x*x)                               //> res2: scala.collection.immutable.IndexedSeq[Int] = Vector(0, 49, 196, 441, 7
                                                  //| 84, 1225, 1764, 2401, 3136, 3969, 4900, 5929, 7056, 8281, 9604, 11025, 12544
                                                  //| , 14161, 15876, 17689, 19600, 21609, 23716, 25921, 28224, 30625, 33124, 3572
                                                  //| 1, 38416, 41209, 44100, 47089, 50176, 53361, 56644, 60025, 63504, 67081, 707
                                                  //| 56, 74529, 78400, 82369, 86436)

	seven.dropWhile(_<100)                    //> res3: scala.collection.immutable.Range = Range(105, 112, 119, 126, 133, 140,
                                                  //|  147, 154, 161, 168, 175, 182, 189, 196, 203, 210, 217, 224, 231, 238, 245, 
                                                  //| 252, 259, 266, 273, 280, 287, 294)

	seven.span(_<50)                          //> res4: (scala.collection.immutable.Range, scala.collection.immutable.Range) =
                                                  //|  (Range(0, 7, 14, 21, 28, 35, 42, 49),Range(56, 63, 70, 77, 84, 91, 98, 105,
                                                  //|  112, 119, 126, 133, 140, 147, 154, 161, 168, 175, 182, 189, 196, 203, 210, 
                                                  //| 217, 224, 231, 238, 245, 252, 259, 266, 273, 280, 287, 294))
	
	val aa = 1::51::seven.toList              //> aa  : List[Int] = List(1, 51, 0, 7, 14, 21, 28, 35, 42, 49, 56, 63, 70, 77, 
                                                  //| 84, 91, 98, 105, 112, 119, 126, 133, 140, 147, 154, 161, 168, 175, 182, 189,
                                                  //|  196, 203, 210, 217, 224, 231, 238, 245, 252, 259, 266, 273, 280, 287, 294)

	aa.span(_<50)                             //> res5: (List[Int], List[Int]) = (List(1),List(51, 0, 7, 14, 21, 28, 35, 42, 4
                                                  //| 9, 56, 63, 70, 77, 84, 91, 98, 105, 112, 119, 126, 133, 140, 147, 154, 161, 
                                                  //| 168, 175, 182, 189, 196, 203, 210, 217, 224, 231, 238, 245, 252, 259, 266, 2
                                                  //| 73, 280, 287, 294))
	
	aa.partition(_<50)                        //> res6: (List[Int], List[Int]) = (List(1, 0, 7, 14, 21, 28, 35, 42, 49),List(5
                                                  //| 1, 56, 63, 70, 77, 84, 91, 98, 105, 112, 119, 126, 133, 140, 147, 154, 161, 
                                                  //| 168, 175, 182, 189, 196, 203, 210, 217, 224, 231, 238, 245, 252, 259, 266, 2
                                                  //| 73, 280, 287, 294))

	aa.forall(_<10)                           //> res7: Boolean = false

	aa.exists(_>10)                           //> res8: Boolean = true

	
}