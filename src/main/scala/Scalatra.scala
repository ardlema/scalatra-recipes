import org.scalatra.LifeCycle
import javax.servlet.ServletContext
import recipes.{AdminController, RecipeController}

class Scalatra extends LifeCycle {

  override def init(context: ServletContext) {


    context mount (new AdminController, "/admin/*")


    context mount (new RecipeController, "/*")



  }
}
