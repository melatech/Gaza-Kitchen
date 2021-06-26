package com.melatech.gazakitchen.data.remote.res

data class Recipe(
    val calories: Double = 0.0, // 2620.983838835843
    val cautions: List<String> = listOf(),
    val cuisineType: List<String> = listOf(),
    val dietLabels: List<String> = listOf(),
    val digest: List<Digest> = listOf(),
    val dishType: List<String> = listOf(),
    val healthLabels: List<String> = listOf(),
    val image: String = "", // https://www.edamam.com/web-img/284/2849b3eb3b46aa0e682572d48f86d487.jpg
    val ingredientLines: List<String> = listOf(),
    val ingredients: List<Ingredient> = listOf(),
    val label: String = "", // Pizza Dough
    val mealType: List<String> = listOf(),
    val shareAs: String = "", // http://www.edamam.com/recipe/pizza-dough-1b6dfeaf0988f96b187c7c9bb69a14fa/pizza
    val source: String = "", // Lottie + Doof
    val totalDaily: TotalDaily = TotalDaily(),
    //val totalNutrients: TotalNutrients = TotalNutrients(),
    val totalTime: Double = 0.0, // 0.0
    val totalWeight: Double = 0.0, // 1634.8942798085639
    val uri: String = "", // http://www.edamam.com/ontologies/edamam.owl#recipe_1b6dfeaf0988f96b187c7c9bb69a14fa
    val url: String = "", // http://www.lottieanddoof.com/2010/01/pizza-pulp-fiction-jim-lahey/
    val yield: Double = 0.0 // 4.0
)