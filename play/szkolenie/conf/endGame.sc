object endGame {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val dupa = Dupa.apply("aaa")                    //> dupa  : Dupa = Dupa@7a93069b
  dupa.string                                     //> res0: String = aaa
  
  val dupa2 =new Dupa("bbb")                      //> dupa2  : Dupa = Dupa@76c0fd31
  dupa2.string                                    //> res1: String = bbb
}


	class Dupa(val string:String)

  object Dupa{
  	def apply(string:String)=new Dupa(string)
  }