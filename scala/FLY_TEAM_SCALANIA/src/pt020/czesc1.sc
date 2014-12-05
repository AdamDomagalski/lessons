package pt020

object czesc1 {
  println("5.12.2014")                            //> 5.12.2014
  println("99 scala problems P14")                //> 99 scala problems P14


def duplicate[A](list:List[A]):List[A] = {
	list.map( a => List(a,a)).flatten
}                                                 //> duplicate: [A](list: List[A])List[A]

def dupFold[A](l:List[A])=l.foldRight(List.empty[A]){(e,l)=>
  	e::e::l
  }                                               //> dupFold: [A](l: List[A])List[A]

   duplicate(List('a, 'b, 'c, 'c, 'd))            //> res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
// List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
  
  
}