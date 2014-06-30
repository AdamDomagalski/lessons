package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import controllers.html.formularz

object Application extends Controller {

  // formularz posilku
  val posilek = Form(posilekMapping)
  
  //maper do formularza
  lazy val posilekMapping = mapping(
      "nazwa"->text,
      "kalorie"->number
  )(Posilek.apply)(Posilek.unapply)
  
  
  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  
  def pokazFormularz = Action {
	  //lepiej wrzucac do views ;)
	  Ok(html.formularz())
  }
}
//klasa posilku 
case class Posilek(nazwa:String, kalorie:Int)