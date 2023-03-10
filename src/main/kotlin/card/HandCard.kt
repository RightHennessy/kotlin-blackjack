package card

class HandCard(val cards: MutableList<Card>) {
    val size = cards.size
    fun add(card: Card) = cards.add(card)
}
