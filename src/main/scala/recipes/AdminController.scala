package recipes

import org.scalatra._
import scalate.ScalateSupport
import grizzled.slf4j.Logger
import net.liftweb.json.Serialization._
import org.ardlema.repository.RecipeRepository
import net.liftweb.json.{NoTypeHints, Serialization}

class AdminController extends ScalatraFilter with ScalateSupport {

  // very simple logger
  val logger = Logger(classOf[AdminController]);

  val recipesRepository = new RecipeRepository;

  // implicit value for json serialization format
  implicit val formats = Serialization.formats(NoTypeHints);


  get("/admin") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate from admin</a>.
      </body>
    </html>
  }


  notFound {
    contentType = "text/html"
    templateEngine.layout("/WEB-INF/views/hello-scalate.scaml")
  }

}