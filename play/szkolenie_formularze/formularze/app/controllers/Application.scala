package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import controllers.html.formularz
import views.html.defaultpages.badRequest

object Application extends Controller {

  // formularz posilku
  val posilekForm = Form(posilekMapping)
  
  //maper do formularza
  lazy val posilekMapping = mapping(
      "nazwa"->nonEmptyText(3, 10).verifying("żadnych warzyw", _ !="warzywo"),
      //"nazwa"->nonEmptyText(3, 10).verifying("żadnych warzyw", nazwa=> nazwa !="warzywo"),
      "kalorie"->number
      // ponizej obsluga globalnych bledow
      // globalne bledy trzeba wyswietlic osobno w htmlu
  )(Posilek.apply)(Posilek.unapply).verifying("blad globalny", posilek=>posilek.kalorie > 3000)
  
  
  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  
  def pokazFormularz = Action {
	  //lepiej wrzucac do views ;)
	  Ok(html.formularz(posilekForm))
  }
  
  def submitForma=Action {
    // implicit aby go potem dalej nie przekazywac
    implicit request => 
      posilekForm.bindFromRequest.fold(
          formWithErrors => BadRequest(html.formularz(formWithErrors)), 
          posilek=>Ok(s" dostalem posilek ${posilek.nazwa}")
      )
  }
}
//klasa posilku 
case class Posilek(nazwa:String, kalorie:Int)