package menu.model

import camp.nextstep.edu.missionutils.Randoms

class RandomNumberGenerator : NumberGenerator {
    override fun generator(): Int {
        return Randoms.pickNumberInRange(RANDOM_MIN_NUMBER, RANDOM_MAX_NUMBER)
    }

    companion object {
        const val RANDOM_MIN_NUMBER = 1
        const val RANDOM_MAX_NUMBER = 5
    }
}