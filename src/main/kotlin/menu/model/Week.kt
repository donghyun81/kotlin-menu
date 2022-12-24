package menu.model

enum class Week(private val dayOfWeek: String) {
    MONDAY("월요일"),
    TUESDAY("화요일"),
    WEDNESDAY("수요일"),
    THURSDAY("목요일"),
    FRIDAY("금요일");

    fun getDayOfWeek() = this.dayOfWeek

}