package pt9

object pt1 {
  println("9.07.2014")                            //> 9.07.2014

	val text = "text randomowy".split(" ")    //> text  : Array[String] = Array(text, randomowy)
	"text randomowy".length                   //> res0: Int = 14
	"text randomowy i cos jeszcze".length()   //> res1: Int = 28
	
	//impicit conversion to string like
	"text randomowy i cos jeszcze".split(" ").map(_.capitalize).mkString(" ")
                                                  //> res2: String = Text Randomowy I Cos Jeszcze
  
  "text randomowy i cos jeszcze".drop(10)         //> res3: String = mowy i cos jeszcze
  
  "text randomowy i cos jeszcze".take(10)         //> res4: String = text rando

	//--------
	val str1 = "aaa"                          //> str1  : String = aaa
	val str2 = "aaa"                          //> str2  : String = aaa
	
	str1==str2                                //> res5: Boolean = true
	//for(c<- "abcde") println(c)
	//for(c<- "abcde"; d<-"apud") println(s"$c+$d")
	
	val a = 22                                //> a  : Int = 22
	s"podatek: $a"                            //> res6: String = podatek: 22
	s"podniesli podatek do ${a+5}%"           //> res7: String = podniesli podatek do 27%

// regular expresion
val pattern = "asd".r                             //> pattern  : scala.util.matching.Regex = asd

pattern.findAllIn("asd asd lks gdw qer").map(_ + " found").foreach(println)
                                                  //> asd found
                                                  //| asd found


}