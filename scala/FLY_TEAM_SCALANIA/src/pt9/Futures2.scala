package pt9

import scala.concurrent.Future
import java.util.concurrent.Executors
import scala.concurrent.ExecutionContext
import scala.util.Success

object Futures2 {
  def main(args: Array[String]) {

    val threadPool = Executors.newFixedThreadPool(2)
    implicit val defaultExecutionContext=ExecutionContext.fromExecutor(threadPool)

    
    println("start")
    val resultFuture = Future(usluga)
    println("stop")
    val resultFuturee = Future(usluga).flatMap(result1=>Future(usluga2(result1)))
    
    resultFuturee.onSuccess{case result=>println(result)}
    
    
    val res = for{
      
      wynik1<-Future(usluga)
      wynik2<-Future(usluga2(wynik1))
      wynik3<-Future(usluga2(wynik2))
    }yield wynik3
  }
  
  def usluga = {
    Thread.sleep(1000)
    "usluga wykonana"
  }
  
  def usluga2(input:String) = {
    Thread.sleep(2000)
    "usluga wykonana2="+input
  }
}