package menu.view

import camp.nextstep.edu.missionutils.Console

class InputView {

    private val outputView = OutputView()
    private val viewValidate = ViewValidate()

    fun readCoachesName(): List<String> {
        return try {
            outputView.printInputCoachNames()
            val coachNames = Console.readLine()
            viewValidate.coachNamesForm(coachNames)
            coachNames.split(INPUT_CONTENTS_SPLIT_UNIT)
        } catch (e: IllegalArgumentException) {
            readCoachesName()
        }
    }

    fun readExcludedFoods(name: String): List<String> {
        return try {
            outputView.printInputExcludedFood(name)
            val excludedFoods = Console.readLine()
            viewValidate.excludedFoodsForm(excludedFoods)
            excludedFoods.split(INPUT_CONTENTS_SPLIT_UNIT)
        } catch (e: IllegalArgumentException) {
            readExcludedFoods(name)
        }
    }

    companion object {
        const val INPUT_CONTENTS_SPLIT_UNIT = ","
    }

}