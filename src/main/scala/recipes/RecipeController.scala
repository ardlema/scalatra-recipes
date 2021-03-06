package recipes

import org.scalatra._
import scalate.ScalateSupport
import grizzled.slf4j.Logger
import net.liftweb.json.Serialization._
import org.ardlema.repository.RecipeRepository
import net.liftweb.json.{NoTypeHints, Serialization}

class RecipeController extends ScalatraFilter with ScalateSupport {

  // very simple logger
  val logger = Logger(classOf[RecipeController])

  val recipesRepository = new RecipeRepository

  // implicit value for json serialization format
  implicit val formats = Serialization.formats(NoTypeHints)

  get("/recipes/:id") {
    // set the result content type
    contentType = "application/json"

    // convert response to json and return as OK
    recipesRepository.get(params("id").toInt) match {
      case Some(x) => Ok(write(x))
      case None => NotFound("Item with id " + params("id") + " not found...")
    }
  }

  get("/ajax") {
    // set the result content type
    "response ajax!!!!"
  }






}
