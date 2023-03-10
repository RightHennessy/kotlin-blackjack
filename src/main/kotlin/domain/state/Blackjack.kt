package domain.state

import domain.HandCard

class Blackjack(handCard: HandCard) : EndGame() {
    override val dividendRate: Double = 1.5

    companion object {
        const val SCORE = 21
        const val SIZE = 2
    }
}
