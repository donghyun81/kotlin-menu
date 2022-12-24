package menu.model

class RecommendDays {

    private val dayOfWeek = Week.values().map { dayOfWeek -> dayOfWeek.getDayOfWeek() }
    private val categoriesName = mutableListOf<String>()

    fun addCategory(category: String) {
        if (categoriesName.count { categoryName -> categoryName == category } <= MAX_CATEGORY_COUNT) {
            categoriesName.add(category)
        }
    }

    fun getCategories() = categoriesName

    fun getDayOfWeek() = dayOfWeek

    companion object {
        const val MAX_CATEGORY_COUNT = 2
    }

}