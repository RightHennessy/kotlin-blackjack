package state

import card.Card
import card.HandCard

class Hit(val handCard: HandCard) : State {
    override fun draw(card: Card): State {
        handCard.add(card)
        if (handCard.getScore() > 21) {
            return Bust(handCard)
        }
        if (handCard.getScore() == 21) {
            return Stay(handCard)
        }
        return Hit(handCard)
    }
}
