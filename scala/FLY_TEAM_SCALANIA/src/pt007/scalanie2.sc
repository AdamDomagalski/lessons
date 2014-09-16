package pt7

object scalanie2 {
  println("16.06.2014")                           //> 16.06.2014
  println("zsumowac wszystkie elementy ciagu fibonacziego parzyste mniejsze od 4000")
                                                  //> zsumowac wszystkie elementy ciagu fibonacziego parzyste mniejsze od 4000

	def fibonaczi(elem:Int):Int= elem match{
			case 0 => 1
			case 1 => 1
			case n => fibonaczi(n-1)+fibonaczi(n-2)
	}                                         //> fibonaczi: (elem: Int)Int
	
// ograniczone bo komp wysiadał przy takich obliczeniach
 val list  = 1 to 40                              //> list  : scala.collection.immutable.Range.Inclusive = Range(1, 2, 3, 4, 5, 6,
                                                  //|  7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26
                                                  //| , 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40)
 
 list.map(fibonaczi(_)).filter(_<4000).sum        //> res0: Int = 6763
}