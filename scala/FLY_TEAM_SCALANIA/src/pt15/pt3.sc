package pt15

object pt3 {
 println("11.08.2014 poprzednich dwóch(trzech?) nie mam bo mnie nie było :P")
                                                  //> 11.08.2014 poprzednich dwóch(trzech?) nie mam bo mnie nie było :P

// learning scalaz

// type classes


def wywolajDwaRazy(tekst:String)(op:String=>Unit)={
op(tekst)
op(tekst)
}                                                 //> wywolajDwaRazy: (tekst: String)(op: String => Unit)Unit


wywolajDwaRazy("aa")((a:String)=>println(a))      //> aa
                                                  //| aa

wywolajDwaRazy("dupa"){a=>
	println(a)
}                                                 //> dupa
                                                  //| dupa

def wypisz(a:String) = println(a)                 //> wypisz: (a: String)Unit

wywolajDwaRazy("foo")(wypisz)                     //> foo
                                                  //| foo
}