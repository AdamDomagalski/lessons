package pt016

object pt1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet


	def repeat(n:Int)(f:() => Unit){
		if(n>0){
			f()
			repeat(n-1)(f)
		}
	}                                         //> repeat: (n: Int)(f: () => Unit)Unit
	
	repeat(5){
		()=>println("aaaa")
	}                                         //> aaaa
                                                  //| aaaa
                                                  //| aaaa
                                                  //| aaaa
                                                  //| aaaa
 
 def myWhile(f: => Boolean)(g: => Unit){
 		if(f) {
 		g
 		myWhile(f)(g)
 		}
 }                                                //> myWhile: (f: => Boolean)(g: => Unit)Unit
 
 var a = 0                                        //> a  : Int = 0
 myWhile( a<4)({a = a+1; println(a)})             //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
 // wywolanie w b z ()=> na poczatku drugiej funkcji sprawi że funkcje wywołujemy osobno
 var b = 0                                        //> b  : Int = 0
 myWhile( b<4){
		{b = b+1; println(b)}
 }                                                //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
 
}