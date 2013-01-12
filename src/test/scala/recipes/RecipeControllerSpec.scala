package recipes

import org.scalatra.test.specs2.ScalatraSpec


/**
 * Set of Unit test to test our API
 */
class RecipeControllerSpec {
  //extends ScalatraSpec {



  //addFilter(classOf[RecipeController], "/*")

  val EXPECTED_RECIPES = """{"name":"Pollo en escabeche","difficulty":"Facil","elaborationTime":0.5,"ingredients":[{"name":"pollo"},{"name":"cebolla"},{"name":"zanahoria"},{"name":"aceite"}],"price":20,"links":[{"linkType":"application/vnd.smartbid.item","rel":"Add recipe","href":"/users/123/addRecipe"}]}"""
  val RECIPE_URL = "/recipes/123"
  val MED_TYPE = "application/json"


  /*def is =
    "Calling an unknown url on the API "               ^
      "returns status 404"                            ! statusResult("/recipes/567",404)^
      end ^ p ^
    "Calling a GET on " + RECIPE_URL + " should"       ^
      "return status 200"                             ! statusResult(RECIPE_URL,200)^
      "and body should equal: " + EXPECTED_RECIPES        ! {get(RECIPE_URL){response.body must_== EXPECTED_RECIPES}}^
      "and media-type should equal: " + MED_TYPE		! {get(RECIPE_URL){response.getContentType must startWith(MED_TYPE)}}
  end

  def statusResult(url:String,code:Int) =
    get(url) {
      status must_== code
    }*/
}
