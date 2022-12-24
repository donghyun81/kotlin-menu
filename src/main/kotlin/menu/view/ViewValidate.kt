package menu.view

import menu.model.Category

class ViewValidate {

    fun coachNamesForm(input: String) {
        val names = input.split(INPUT_CONTENTS_SPLIT_UNIT)
        names.forEach { name ->
            require(COACH_NAMES_FORM.toRegex().matches(name)) { ErrorMessage.COACH_NAMES_FORM.printErrorMessage() }
        }
        require((MIN_COACHES_COUNT..MAX_COACHES_COUNT).contains(names.size)) { ErrorMessage.COACHES_COUNT.printErrorMessage() }
    }

    fun excludedFoodsForm(input: String) {
        val foods = input.split(INPUT_CONTENTS_SPLIT_UNIT)
        var allMenu = listOf<String>()
        Category.values().forEach { category -> allMenu += category.getCategoryFoods() }
        foods.forEach { food ->
            require(allMenu.contains(food) || food == EMPTY_STRING) { ErrorMessage.HAS_MENU.printErrorMessage() }
        }
        require((MIN_EXCLUDE_FOODS_COUNT..MAX_EXCLUDE_FOODS_COUNT).contains(foods.size)) { ErrorMessage.EXCLUDE_FOODS_COUNT }
        require(foods.size == foods.distinct().size) { ErrorMessage.DUPLICATE_MENU }
    }

    companion object {
        private const val COACH_NAMES_FORM = "^.{2,4}\$"
        private const val INPUT_CONTENTS_SPLIT_UNIT = ","
        private const val EMPTY_STRING = ""
        private const val MIN_COACHES_COUNT = 2
        private const val MAX_COACHES_COUNT = 5
        private const val MIN_EXCLUDE_FOODS_COUNT = 0
        private const val MAX_EXCLUDE_FOODS_COUNT = 2

    }
}