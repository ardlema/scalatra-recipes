package org.ardlema.model

case class Recipe (
                    name:String,
                    difficulty:String,
                    elaborationTime:Double,
                    ingredients:List[Ingredient],
                    price:Option[Long],
                    links:List[Link]
)
