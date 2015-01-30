package pt022

import java.util.concurrent.Callable
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import java.util.concurrent.BlockingQueue
import java.util.concurrent.LinkedBlockingDeque
import java.util.Random
import scala.annotation.tailrec

object pt4 {

  def main(args: Array[String]) {
    val q:BlockingQueue[String] = new LinkedBlockingDeque(4)
    
    val p = new Producer(q)
    val c = new Consumer(q)
    
    p.start
    c.start
    
    p.join
    c.join
  }

  
  class Producer(q: BlockingQueue[String]) extends Thread {
    
    private val r = new Random()
    
    override def run = {
      while(true){
        val e = s"Element ${r.nextInt(10)}"
        println(s"addingElement ${e}")
        q.put(e)
        println(s"q size ${q.size}")
        TimeUnit.SECONDS.sleep(1)
      }
    }
  }
  
  class Consumer (q:BlockingQueue[String]) extends Thread{
    
    @tailrec
    override final def run() = {
      val e= q.take()
      println(s" taken element ${e} : q size ${q.size}")
      TimeUnit.MILLISECONDS.sleep(2500)
      run()
    }
    
  }
  
}