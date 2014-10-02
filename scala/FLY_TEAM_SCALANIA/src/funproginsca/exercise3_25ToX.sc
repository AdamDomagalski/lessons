package funproginsca

object exercise3_25ToX {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet|
  
  
  val tree = Tree(Tree(1,3),Tree(2,5))
  
  Tree.size(tree)
  
}




object Tree{
	sealed trait Tree[+A]
	case class Leaf[A](value: A) extends Tree[A]
	case class Branch[A](left: Tree[A], right: Tree[A]) extends Tree[A]
	case object MyNil extends Tree[Nothing]
	
	def apply[A](l:A,r:A): Tree[A] ={
		Tree(l,r)
	}
	
	def size[A](tree : Tree[A]):Int = tree match{
	case MyNil => 0
	case Leaf(a) => 1
	case Branch(a,b) => size(a)+size(b)
	
	
	}
}