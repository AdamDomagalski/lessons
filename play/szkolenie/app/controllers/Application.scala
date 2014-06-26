package controllers

import play.api._
import play.api.mvc._
import org.omg.CosNaming.NamingContextPackage.NotFound

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def hello = Action {
    Ok("Hello")
  }
  
  def product(id:Int)=Action{
    ProductDatabase.products.get(id) map {product =>
      Ok(BusinessModule.businessMetod(product))
      //Ok(s"your product is ${product.name}")
    } getOrElse {
      NotFound("Nie znaleziono produktu")
    }
  }
  
  def presentProduct = Action{
    Ok(views.html.szkolenie(Product("Komputer)")))
  }
}

object BusinessModule{
  def businessMetod(product:Product) = s"your product is ${product.name}" 
}
case class Product(name:String)

object ProductDatabase{
  val products=Map(1->Product("Lodówka"))
}