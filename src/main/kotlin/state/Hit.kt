package state

import card.HandCard

class Hit(handCard: HandCard) : OnGame(handCard) {

    override fun getState(handCard: HandCard): State {
        return when {
            handCard.getScore() > Blackjack.SCORE -> Bust(handCard)
            handCard.getScore() == Blackjack.SCORE -> Stay(handCard)
            else -> Hit(handCard)
        }
    }
}
