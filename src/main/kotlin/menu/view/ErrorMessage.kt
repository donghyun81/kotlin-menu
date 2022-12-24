package menu.view

enum class ErrorMessage(private val message: String) {
    COACH_NAMES_FORM("코치의 이름은 2글자 부터 4명글자 까지 입력해야 합니다."),
    COACHES_COUNT("코치는 최소 2명 부터 최대 5명 까지만 입력해주세요."),
    HAS_MENU("못먹는 음식은 메뉴에 포함되는 음식만 입력해주세요"),
    EXCLUDE_FOODS_COUNT("못먹는 음식은 2개 이하만 입력해주세요."),
    DUPLICATE_MENU("못먹는 음식을 중복 없이 입력해주세요.");

    fun printErrorMessage() {
        println(ERROR + this.message)
    }

    companion object {
        const val ERROR = "[ERROR] "
    }
}