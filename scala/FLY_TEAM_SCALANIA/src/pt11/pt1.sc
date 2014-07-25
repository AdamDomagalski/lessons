package pt11

object pt1 {
  println("25.06.2014")                           //> 25.06.2014

	implicit class  luvrer(s:String){
		
		def luvrator = {
			s+"luvreveredblablabla"
		}	}
	
	"++".luvrator                             //> res0: String = ++luvreveredblablabla
	
	val vector = "nmlsd".map(x=> x.toUpper+"1")
                                                  //> vector  : scala.collection.immutable.IndexedSeq[String] = Vector(N1, M1, L1,
                                                  //|  S1, D1)
  vector.mkString                                 //> res1: String = N1M1L1S1D1
  
  
  def ourMap[A,B](f:A=>B,a:List[A]):List[B] =
  	a.map(f)                                  //> ourMap: [A, B](f: A => B, a: List[A])List[B]
  	
 def f(c:Char):String=c.toUpper+"_"               //> f: (c: Char)String
 
 ourMap(f,List('a','b'))                          //> res2: List[String] = List(A_, B_)


  def naszeMap[A,B](f:A=>B,a:Traversable[A]):Traversable[B] =
  	a.map(f)                                  //> naszeMap: [A, B](f: A => B, a: Traversable[A])Traversable[B]

	naszeMap(f,"ab")                          //> res3: Traversable[String] = Vector(A_, B_)


}