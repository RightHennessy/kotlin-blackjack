package state

import card.HandCard

class FirstTurn(handCard: HandCard) : OnGame(handCard) {
    override fun getState(handCard: HandCard): State {
        if (handCard.size == 2) {
            if (handCard.getScore() == 21)
                return Blackjack(handCard)
            return Hit(handCard)
        }
        return FirstTurn(handCard)
    }
}
