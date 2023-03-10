package state

import card.HandCard

class FirstTurn(handCard: HandCard) : OnGame(handCard) {

    override fun getState(handCard: HandCard): State {
        return when {
            handCard.getScore() == Blackjack.SCORE -> Blackjack(handCard)
            handCard.size == Blackjack.SIZE -> Hit(handCard)
            else -> FirstTurn(handCard)
        }
    }
}
