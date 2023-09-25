data class Recipe(val title: String,
    val mainIngredient: String,
    val isVegetarian: Boolean = false,
    val difficulty: String = "Easy")

class Mushroom(val size: Int, val isMagic: Boolean){
    constructor(isMagicParam: Boolean) : this(0, isMagicParam) {
        //code
    }
}

fun findRecipe(title: String = "",
               ingredient: String = "",
               isVegetarian: Boolean = false,
               difficulty: String = "") : Array<Recipe> {
    //Code to find recipes
    return arrayOf(Recipe(title, ingredient, isVegetarian, difficulty))

}

fun addNumbers(a: Int, b: Int) : Int {
    return a + b
}

fun addNumbers(a: Double, b: Double) : Double {
    return a + b
}