package org.ardlema.repository

import org.ardlema.model.{Ingredient, Link, Recipe}
import collection.immutable.Range.Long

class RecipeRepository {

  def get(id: Int) : Option[Recipe] = {

    id.intValue() match {
      case 123 => {
        val addLink = new Link("application/vnd.smartbid.item","Add recipe","/users/123/addRecipe");
        val ingredient1 = new Ingredient("pollo");
        val ingredient2 = new Ingredient("cebolla");
        val ingredient3 = new Ingredient("zanahoria");
        val ingredient4 = new Ingredient("aceite");

        val item = new Recipe(
          "Pollo en escabeche",
          "Facil",
          0.5,
          List(ingredient1,ingredient2,ingredient3,ingredient4),
          Some(20),
          List(addLink));

        Option(item);
      };

      case _ => Option(null);
    }
  }

  //def delete(item: Item) = println("deleting user: " + item)

}
