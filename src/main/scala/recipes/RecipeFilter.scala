package recipes

import org.scalatra._
import scalate.ScalateSupport

class RecipeFilter extends ScalatraFilter with ScalateSupport {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }


  notFound {
    contentType = "text/html"
    templateEngine.layout("/WEB-INF/views/hello-scalate.scaml")
  }

}
