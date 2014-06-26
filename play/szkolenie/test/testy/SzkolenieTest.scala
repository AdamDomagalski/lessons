package testy

import play.api.test.PlaySpecification
import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner
import controllers.BusinessModule
import controllers.Product
import org.specs2.specification.Tags
import play.api.test.FakeRequest
import org.omg.CosNaming.NamingContextPackage.NotFound
import play.api.test.WithApplication
import play.api.test.WithApplication
import views.html.defaultpages.notFound

@RunWith(classOf[JUnitRunner])
class SzkolenieTest extends PlaySpecification with Tags {

	"Business Module" should {
	  "format proper business message" in {
	    val product = Product("Komputer")
	    val result = BusinessModule.businessMetod(product)
	    result must beEqualTo("your product is Komputer")
	  } tag("unit")
	  
	  "return 404 when there is no product" in new WithApplication {
	    val result = route(FakeRequest(GET, "/products/2")).get
	    status(result) must equalTo(NOT_FOUND)
	  } 
	  
	  "return 200 when there is a product" in new WithApplication{
	    val result = route(FakeRequest(GET, "/products/1")).get
	    status(result) must equalTo(OK)
	  }
	  
	    
	  }
	"product view" should {
	  
	  "display proper html" in {
	    val product = Product("Komputer")
	    val result = views.html.szkolenie(product);
	    contentAsString(result) must contain(s"Nasz produkt to <h1>${product.name}</h1>");
	  }
	}
}