package menu.model

class Menu {

    fun getCategoryMenu(category: String): List<String> {
        var menus = listOf<String>()
        when (category) {
            Category.ASIAN_FOOD.getCategoryName() -> menus = Category.ASIAN_FOOD.getCategoryFoods()
            Category.CHINESE_FOOD.getCategoryName() -> menus = Category.CHINESE_FOOD.getCategoryFoods()
            Category.JAPANESE_FOOD.getCategoryName() -> menus = Category.JAPANESE_FOOD.getCategoryFoods()
            Category.KOREAN_FOOD.getCategoryName() -> menus = Category.KOREAN_FOOD.getCategoryFoods()
            Category.WESTERN_FOOD.getCategoryName() -> menus = Category.WESTERN_FOOD.getCategoryFoods()
        }
        return menus
    }

}