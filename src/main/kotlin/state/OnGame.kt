package state

import card.Card
import card.HandCard

abstract class OnGame(private val handCard: HandCard) : State {
    override fun draw(card: Card): State {
        handCard.add(card)
        return getState(handCard)
    }

    abstract fun getState(handCard: HandCard): State
}
