package pt10

object pt2 {
  println("17.7.2014")                            //> 17.7.2014

	//implicit conversion, stringLike
	val reg="[a-z]".r                         //> reg  : scala.util.matching.Regex = [a-z]


	val numReg =  "\\d+".r                    //> numReg  : scala.util.matching.Regex = \d+
	val text="dupa 123"                       //> text  : String = dupa 123
	numReg.findFirstIn(text)                  //> res0: Option[String] = Some(123)
	
	
	val tuple = ("aaa","bbb")                 //> tuple  : (String, String) = (aaa,bbb)
	val (jeden,dwa) = tuple                   //> jeden  : String = aaa
                                                  //| dwa  : String = bbb
}