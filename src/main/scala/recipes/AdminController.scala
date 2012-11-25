package recipes

import org.scalatra._
import scalate.ScalateSupport
import grizzled.slf4j.Logger
import net.liftweb.json.Serialization._
import org.ardlema.repository.{UserRepository, RecipeRepository}
import net.liftweb.json.{NoTypeHints, Serialization}
import com.escalatesoft.subcut.inject.{Injectable, BindingModule}
import org.ardlema.services.IdentityService

class AdminController(implicit val bindingModule: BindingModule) extends ScalatraFilter
      with ScalateSupport
      with Injectable {

  // very simple logger
  val logger = Logger(classOf[AdminController])


  val identityService = inject[IdentityService]

  val userRepository = inject[UserRepository]


  // implicit value for json serialization format
  implicit val formats = Serialization.formats(NoTypeHints)


  get("/admin") {
    contentType = "text/html"
    templateEngine.layout("/WEB-INF/views/login.jade")
  }

  get("/admin/checkUser") {
    contentType = "text/html"
    val userId = params.get("userId")
    val theUser = identityService.get(userRepository, userId.get,"")
    templateEngine.layout("/WEB-INF/views/home.jade",Map("userId" -> theUser.get.name))
  }


  notFound {
    contentType = "text/html"
    templateEngine.layout("/views/home.jade")
  }

}
