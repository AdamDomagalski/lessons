package pt022

object OstatniWarsztat {

  def main(args: Array[String]) {
    var b = false
    val t = new Thread(new Task(b))
    
    /*
    // odpala tylko metode
    t.run
    // odpala nowy proces który odpala metode
    t.start
     */
    
    t.start
    b=true
    println("bbb")
  }

  class Task(val b: Boolean) extends Runnable {
    def run(): Unit = {
      println("dupa")
      println(b)
    }
  }
}