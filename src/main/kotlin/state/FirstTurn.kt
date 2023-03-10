package state

import card.Card
import card.HandCard

class FirstTurn(val handCard: HandCard) : State {
    override fun draw(card: Card): State {
        handCard.add(card)
        if (handCard.size == 2) {
            if (handCard.getScore() == 21)
                return Blackjack(handCard)
            return Hit(handCard)
        }
        return FirstTurn(handCard)
    }
}
