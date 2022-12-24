package menu.controller

import camp.nextstep.edu.missionutils.Randoms
import menu.model.*

class RecommendMenuImpl(coaches: List<Coach>) : RecommendMenu() {
    private val week = RecommendDays()
    private val menu = Menu()
    private val coaches = coaches
    private val randomNumberGenerator = RandomNumberGenerator()

    init {
        val category = Category.values()
        category.shuffle()
        repeat(week.getDayOfWeek().size) {
            addRandomCategory(category[DEFAULT_INDEX])
            recommendMenu(category[DEFAULT_INDEX], menu)
        }

    }

    override fun addRandomCategory(category: Category) {
        val categoriesCount = week.getCategories().size
        var categories = week.getCategories().size
        while (categoriesCount == categories) {
            val categoriesName = Category.values().map { category -> category.getCategoryName() }
            week.addCategory(categoriesName[randomNumberGenerator.generator() - RANDOM_NUMBER_MINUS_INDEX])
            categories = week.getCategories().size
        }
    }

    override fun recommendMenu(category: Category, menu: Menu) {
        coaches.map { coach ->
            val coachMenusCount = coach.getRecommendedMenus().size
            while (coachMenusCount == coach.getRecommendedMenus().size) {
                val menu = Randoms.shuffle(menu.getCategoryMenu(category.getCategoryName()))[DEFAULT_INDEX]
                coach.addRecommendedMenus(menu)
            }
        }
    }

    fun getWeek() = week

    fun getCoaches() = coaches

    companion object {
        const val DEFAULT_INDEX = 0
        const val RANDOM_NUMBER_MINUS_INDEX = 1
    }
}