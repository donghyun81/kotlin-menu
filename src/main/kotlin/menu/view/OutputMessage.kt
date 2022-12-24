package menu.view

import java.lang.StringBuilder

enum class OutputMessage(private val message: String) {
    START("점심 메뉴 추천을 시작합니다."),
    INPUT_COACH_NAMES("코치의 이름을 입력해 주세요. (, 로 구분)"),
    INPUT_EXCLUDED_FOOD("(이)가 못 먹는 메뉴를 입력해 주세요."),
    RECOMMEND_RESULT("메뉴 추천 결과입니다."),
    DIVISION("구분"),
    CATEGORY("카테고리"),
    COACH(""),
    RECOMMEND_END("추천을 완료했습니다.");

    fun guide() = this.message

    fun guide(name: String) = name + this.message

    fun <T> recommendResult(result: T): String {
        return "[ ${this.message} | $result ]"
    }

    fun <T> recommendResult(name: T, result: T): String {
        return "[ $name | $result ]"
    }
}