package recipes

import org.scalatest.FlatSpec
import org.openqa.selenium._
import chrome.ChromeDriver
import firefox.FirefoxDriver
import org.openqa.selenium.htmlunit._

class GoogleSearch extends FlatSpec  {

  System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
  val driver = new ChromeDriver
  driver.get("http://localhost:8080/admin")
  // verify we retrieve the page and have the title
  "Recipes 2.0" should "have the proper title" in {
    assert(driver.getTitle() === "Recipes: Your online cookbook")
  }

  /*it should "be able to perform a query" in {
    // get form element
    val inputElement = driver.findElement(By.name("q"))

    // type in search query
    inputElement.sendKeys("San Francisco")

    // submit form
    inputElement.submit
  }*/

}
