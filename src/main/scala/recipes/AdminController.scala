package recipes

import org.scalatra._
import scalate.ScalateSupport
import grizzled.slf4j.Logger
import org.ardlema.repository.UserRepository
import net.liftweb.json.{NoTypeHints, Serialization}
import com.escalatesoft.subcut.inject.{Injectable, BindingModule}
import org.ardlema.services.IdentityService
import org.ardlema.config.Dependencies._

class AdminController extends ScalatraFilter
      with ScalateSupport {

  // very simple logger
  val logger = Logger(classOf[AdminController])


  // implicit value for json serialization format
  implicit val formats = Serialization.formats(NoTypeHints)


  get("/admin") {
    contentType = "text/html"
    templateEngine.layout("/WEB-INF/views/login.jade")
  }

  get("/admin/checkUser") {
    contentType = "text/html"
    val userId = params.get("userId")
    val userPassword = params.get("password")
    val isRegistered = identityService.isRegisteredUser(userId.get, userPassword.get)
    isRegistered match {
      case false => templateEngine.layout("/WEB-INF/views/login.jade")
      case _ => templateEngine.layout("/WEB-INF/views/home.jade",Map("userId" -> userId.get))
    }
  }


  notFound {
    contentType = "text/html"
    templateEngine.layout("/views/home.jade")
  }

}
