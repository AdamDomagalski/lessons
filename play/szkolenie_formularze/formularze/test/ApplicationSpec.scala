import org.specs2.mutable._
import org.specs2.runner._
import org.junit.runner._
import play.api.test._
import play.api.test.Helpers._
import controllers.Application

/**
 * Add your spec here.
 * You can mock out a whole application including requests, plugins etc.
 * For more information, consult the wiki.
 */
@RunWith(classOf[JUnitRunner])
class ApplicationSpec extends Specification {

  "Application" should {

    "map posilek data" in{
      val data = Map("nazwa"->"pomidorowa", "kalorie"->"500")
      val result = Application.posilekMapping.bind(data)
      result.isRight must beTrue
    }
    
    "find errors while mapping Posilek data" in{
      val data = Map("nazwa"->"pomidorowa", "kalorie"->"500b")
      val result = Application.posilekMapping.bind(data)
      result.isLeft must beTrue
      //rzuci errorem 
      //result.isRight must beTrue
    }
    
    "find errors while mapping Posilek form" in{
      val data = Map("nazwa"->"pomidorowa", "kalorie"->"500b")
      val result = Application.posilekForm.bind(data)
      result.errors must have (_.key=="kalorie")
      //to samo co
      //result.errors must have (e=>e.key=="kalorie")
    }
    
    "send 404 on a bad request" in new WithApplication{
      route(FakeRequest(GET, "/boum")) must beNone
    }

    "render the index page" in new WithApplication{
      val home = route(FakeRequest(GET, "/")).get

      status(home) must equalTo(OK)
      contentType(home) must beSome.which(_ == "text/html")
      contentAsString(home) must contain ("Your new application is ready.")
    }
  }
}
