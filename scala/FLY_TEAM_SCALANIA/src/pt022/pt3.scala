package pt022

import java.util.concurrent.Callable
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

object pt3 {

  def main(args: Array[String]) {
	  val l = List.tabulate(100)(identity)
	  val pool = Executors.newFixedThreadPool(3)

	  val futures = ( 0 to 10) map {i=>
	    	pool.submit(new Task(l,i*10))
	    }
	  
	  
	  
	  val result = futures.map(_.get).sum
	  
	  println(result)
	  
	  pool.shutdown()
	  pool.awaitTermination(1, TimeUnit.MINUTES)
  }

  class Task(val l: List[Int], start:Int) extends Callable[Int] {
    
    def call(): Int = {
    	TimeUnit.SECONDS.sleep(1)
    	l.slice(start,start+10).sum
      }
  }
}