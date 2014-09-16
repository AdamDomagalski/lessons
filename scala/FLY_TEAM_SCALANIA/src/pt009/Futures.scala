package pt009

import scala.concurrent.Future
import java.util.concurrent.Executors
import scala.concurrent.ExecutionContext
import scala.util.Success

object Futures {

  def main(args: Array[String]) {

    val threadPool = Executors.newFixedThreadPool(2)
    // i nie trzeba przekazywac dalej dzieki implicit
    implicit val defaultExecutionContext=ExecutionContext.fromExecutor(threadPool)
    println("start")
    // mozna przetwazac
    val resultFuture = Future(usluga).map(_+" dobrze")
//    val resultFuture = Future(usluga)
    
    val resultFuture2 = Future(usluga2)
//    println(usluga)
    println("stop")
    
    
    val firstCompleted = Future.firstCompletedOf(Seq(resultFuture,resultFuture2)).map(_+" jako pierwsza")
    
    
    firstCompleted.onSuccess{case result=> println(result)}
    
    // wykonuje tylko jesli zakonczy sie sukcesem
    // klamerki pozwalaja przekazac cialo funkcji bez nich trzeba by robic standardowy pattern matching
    resultFuture.onComplete{case Success(result) =>  println(result)}
    
    
    resultFuture.onSuccess{case result => println(result)}
    resultFuture.onFailure{case result => println(result)}
  }
  
  def usluga = {
    Thread.sleep(1000)
    "usluga wykonana"
  }
  
  def usluga2 = {
    Thread.sleep(2000)
    "usluga wykonana2"
  }
}