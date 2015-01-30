package pt022

import scala.actors.threadpool.TimeUnit

object pt2 {

  def main(args: Array[String]) {
	  val l = List.tabulate(100)(identity)

	  val tasks = ( 1 to 10) map {i=>
	    	new Task(l,i*10)
	    }
	  
	  val threads = tasks.map(new Thread(_))
	  threads.foreach(_.start)
	  threads.foreach(_.join)
	  val result = tasks.map(_.sum).sum
	  println(result)
  }

  class Task(val l: List[Int], start:Int) extends Runnable {
    private var _sum = 0;
    
    def run(): Unit = {
    	_sum = l.slice(start,start+10).sum
    	TimeUnit.SECONDS.sleep(1)
      }
            
    def sum = _sum
  }
}