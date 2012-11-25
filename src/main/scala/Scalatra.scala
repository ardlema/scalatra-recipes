import org.scalatra.LifeCycle
import javax.servlet.ServletContext
import recipes.{Dependencies, AdminController, RecipeController}

class Scalatra extends LifeCycle {

  override def init(context: ServletContext) {

    implicit val bindingModule = Dependencies

    context mount (new AdminController, "/admin/*")


    context mount (new RecipeController, "/*")



  }
}
