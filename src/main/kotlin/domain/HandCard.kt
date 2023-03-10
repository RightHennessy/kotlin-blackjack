package domain

class HandCard(cards: List<Card>) {
    private var _cards = cards.toMutableList()
    private val cards
        get() = _cards.toList()

    val size
        get() = cards.size

    fun add(card: Card) = _cards.add(card)

    fun getScore(): Int {
        var score = cards.sumOf { it.cardNumber.score }
        if (cards.any { it.cardNumber == CardNumber.ACE } && score + 10 <= 21)
            return score + 10
        return score
    }
}
