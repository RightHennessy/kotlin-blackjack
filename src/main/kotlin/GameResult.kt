enum class GameResult(val description: String) {
    WIN("승"),
    LOSE("패"),
    DRAW("무");

    operator fun not(): GameResult = if (this == WIN) {
        LOSE
    } else if (this == LOSE) {
        WIN
    } else {
        DRAW
    }
    companion object {
        // TODO: 결과값 반환 if 문 개선
        fun valueOf(myScore: Int, otherScore: Int): GameResult = if (myScore == otherScore) {
            DRAW
        } else if ((myScore < otherScore) or (myScore > 21)) {
            LOSE
        } else {
            WIN
        }
    }
}
