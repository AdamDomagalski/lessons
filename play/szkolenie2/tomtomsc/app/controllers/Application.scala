package controllers

import play.api._
import play.api.mvc._
import scala.collection.immutable.Seq

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Dupa."))
  }

  def akcja2 = Action {
    Ok(html.Widok(Seq("tekst z kontrolera", "drugi")))
  }
  
  
//  def akcja3 = Action {
//   BadResource("To nie jest moja akcja")
//  }

}