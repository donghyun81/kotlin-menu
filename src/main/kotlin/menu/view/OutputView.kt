package menu.view

import menu.model.Coach
import menu.model.RecommendDays

class OutputView {

    fun printStart() = println(OutputMessage.START.guide())

    fun printInputCoachNames() = println(OutputMessage.INPUT_COACH_NAMES.guide())

    fun printInputExcludedFood(name: String) = println(OutputMessage.INPUT_EXCLUDED_FOOD.guide(name))


    fun printRecommendResult(week: RecommendDays, coaches: List<Coach>) {
        println(OutputMessage.RECOMMEND_RESULT.guide())
        println(OutputMessage.DIVISION.recommendResult(week.getDayOfWeek().joinToString(" | ")))
        println(OutputMessage.CATEGORY.recommendResult(week.getCategories().joinToString(" | ")))
        coaches.forEach { coach ->
            println(OutputMessage.COACH.recommendResult(coach.getName(),coach.getRecommendedMenus().joinToString(" | ")))

        }
    }

    fun printEnd() = println(OutputMessage.RECOMMEND_END.guide())
}