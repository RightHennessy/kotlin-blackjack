package state

import card.Card
import card.HandCard

class FirstTurn(val handCard: HandCard) {
    fun draw(card: Card): FirstTurn {
        handCard.add(card)
        // if(handCard.size == 1)
        return FirstTurn(handCard)
    }
}
