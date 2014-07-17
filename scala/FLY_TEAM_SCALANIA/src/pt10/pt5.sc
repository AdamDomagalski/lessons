package pt10

object pt5 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  class User(var name:String);
  val user = new User("stefan")                   //> user  : pt10.pt5.User = pt10.pt5$$anonfun$main$1$User$1@29d322a6
  user.name = "zdzichu"
  user.name                                       //> res0: String = zdzichu
  case class ImmutableNumber(i:Int){
  	def +(other:ImmutableNumber)=ImmutableNumber(other.i+i)
  }
  val _1=ImmutableNumber(1)                       //> _1  : pt10.pt5.ImmutableNumber = ImmutableNumber(1)
  val _2=ImmutableNumber(2)                       //> _2  : pt10.pt5.ImmutableNumber = ImmutableNumber(2)
  val _3=ImmutableNumber(3)                       //> _3  : pt10.pt5.ImmutableNumber = ImmutableNumber(3)
  
  _1+_2+_3+_1+_1                                  //> res1: pt10.pt5.ImmutableNumber = ImmutableNumber(8)
  
  
  
  case class MutableNumber(var i:Int){
  	def +(other:MutableNumber) = {i=i+other.i;this}
  }
  
  val one1 = MutableNumber(1)                     //> one1  : pt10.pt5.MutableNumber = MutableNumber(1)
  val one2 = MutableNumber(2)                     //> one2  : pt10.pt5.MutableNumber = MutableNumber(2)
  val one3 = MutableNumber(3)                     //> one3  : pt10.pt5.MutableNumber = MutableNumber(3)
  
  one1+one2+one1+one3+one1+one1+one3+one3         //> res2: pt10.pt5.MutableNumber = MutableNumber(42)
 
}