package card

class HandCard(val cards: MutableList<Card>) {
    val size
        get() = cards.size

    fun add(card: Card) = cards.add(card)

    fun getScore(): Int {
        var score = cards.sumOf { it.cardNumber.score }
        if (cards.any { it.cardNumber == CardNumber.ACE } && score + 10 <= 21)
            return score + 10
        return score
    }
}
