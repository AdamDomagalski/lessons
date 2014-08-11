package pt15

import java.io.Closeable
import scala.io.Source
import java.io.FileInputStream
import java.io.InputStream

object pt4 {
  println("11.08.2014 poprzednich dwóch(trzech?) nie mam bo mnie nie było :P")
                                                  //> 11.08.2014 poprzednich dwóch(trzech?) nie mam bo mnie nie było :P

  def wywolaj(src: InputStream)(op: InputStream => Unit) = {
    try {
      op(src)
    } finally {
      src.close()
    }
  }                                               //> wywolaj: (src: java.io.InputStream)(op: java.io.InputStream => Unit)Unit

	wywolaj(new FileInputStream("/home/domagalsk/asd.txt"))(a=> println(a))
                                                  //> java.io.FileInputStream@4344a263

wywolaj(new FileInputStream("/home/domagalsk/asd.txt"))(wypisywanie(_))
                                                  //> asd to to 

def wypisywanie(a:InputStream) = {
	val src = Source.fromInputStream(a)
	src.getLines.foreach(println(_))
}                                                 //> wypisywanie: (a: java.io.InputStream)Unit
}