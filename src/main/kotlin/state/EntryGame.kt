package state

import card.Card
import card.HandCard

class EntryGame(val handCard: HandCard) : State() {
    fun draw(card: Card): State {
        handCard.add(card)
        if (handCard.size == 2) {
            if (handCard.getScore() == 21)
                return Blackjack(handCard)
            return Hit(handCard)
        }
        return EntryGame(handCard)
    }
}
