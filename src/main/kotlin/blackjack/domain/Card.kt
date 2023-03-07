package blackjack.domain

class Card(
    val number: CardNumber,
    val shape: Shape
) {

    companion object {
        const val SPECIAL_CARDS_NAME_LENGTH = 1

        val ALL_CARDS: Set<Card> = CardNumber.values().flatMap { cardNumber ->
            Shape.values().map {
                shape ->
                Card(cardNumber, shape)
            }
        }.toSet()
    }
}
