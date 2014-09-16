package pt10

object pt1 {
  println("17.7.2014")                            //> 17.7.2014

	val vowel = Set('a','o','e','i','y')      //> vowel  : scala.collection.immutable.Set[Char] = Set(e, y, a, i, o)
	// wywalić wszystkie samogłoski
	"Siema ziomale".filter(!vowel.contains(_))//> res0: String = Sm zml


	val isVowel=(c:Char)=>vowel.contains(c)   //> isVowel  : Char => Boolean = <function1>
	val isNotVovel = (c:Char) => !isVowel(c)  //> isNotVovel  : Char => Boolean = <function1>
	
	"Siema ziomale".filter(isNotVovel)        //> res1: String = Sm zml
}