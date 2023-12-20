class Category(
    val title: String,
    val label: String,
    val listCategory: List<String>,
    val pictureCategory: String,
    val titleDish: String,
    val subtitleDish: String,
)

class Recipes(
    val title: String,
    val label: String,
    val listDish: List<String>,
    val pictureDish: String,
    val nameDish: String,
)

class Ingredient(
    val title: String,
    val label: String,
    val listIngredient: List<String>,
    val quantity: List<Int>,
    val inFavorite: Boolean = false,
)