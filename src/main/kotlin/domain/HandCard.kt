package domain

import domain.state.Blackjack

class HandCard(cards: List<Card>) {
    private var _cards = cards.toMutableList()
    private val cards
        get() = _cards.toList()

    val size
        get() = cards.size

    fun add(card: Card) = _cards.add(card)

    fun getScore(): Int {
        var score = cards.sumOf { it.cardNumber.score }
        if (cards.any { it.cardNumber == CardNumber.ACE } && score + ACE_SOFT_SCORE <= Blackjack.SCORE)
            return score + ACE_SOFT_SCORE
        return score
    }

    companion object {
        private const val ACE_SOFT_SCORE = 10
    }
}
