package state

import card.Card
import card.CardNumber
import card.HandCard
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FirstTurnTest {
    @Test
    fun draw() {
        val card = HandCard(mutableListOf(Card(CardNumber.FIVE)))
        val actual = FirstTurn(card).draw(Card(CardNumber.EIGHT))
        assertThat(actual).isInstanceOf(FirstTurn(card)::class.java)
    }
}
