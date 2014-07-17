package pt10

object pt3 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  implicit class ScalanieString(s:String){
  def quote=s"'$s'"
  
  val vowel = Set('a','o','e','i','y')
  val isVowel=(c:Char)=>vowel.contains(c)
	val isNotVovel = (c:Char) => !isVowel(c)
  
  def removeVowels= s"'$s'".filter(isNotVovel)
  
  }
  
  "siema kakadu".quote                            //> res0: String = 'siema kakadu'
  "siema kakadu".removeVowels                     //> res1: String = 'sm kkdu'
}