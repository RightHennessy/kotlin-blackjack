package state

import card.HandCard

class Hit(handCard: HandCard) : OnGame(handCard) {

    override fun getState(handCard: HandCard): State {
        if (handCard.getScore() > 21) {
            return Bust(handCard)
        }
        if (handCard.getScore() == 21) {
            return Stay(handCard)
        }
        return Hit(handCard)
    }
}
