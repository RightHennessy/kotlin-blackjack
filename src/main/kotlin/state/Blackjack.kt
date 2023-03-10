package state

import card.HandCard

class Blackjack(handCard: HandCard) : EndGame() {
    companion object {
        const val SCORE = 21
        const val SIZE = 2
    }
}
