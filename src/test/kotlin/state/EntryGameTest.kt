package state

import card.Card
import card.CardNumber
import card.HandCard
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EntryGameTest {
    @Test
    fun `처음 받은 2장의 합이 21이면 blackjack 상태가 된다`() {
        val card = HandCard(mutableListOf(Card(CardNumber.ACE)))
        val actual = FirstTurn(card).draw(Card(CardNumber.KING))
        assertThat(actual).isInstanceOf(Blackjack(card)::class.java)
    }

    @Test
    fun `2장을 받으면 blackjack 이 아닌 경우 hit 상태가 된다`() {
        val card = HandCard(mutableListOf(Card(CardNumber.FIVE)))
        val actual = FirstTurn(card).draw(Card(CardNumber.EIGHT))
        assertThat(actual).isInstanceOf(Hit(card)::class.java)
    }

    @Test
    fun `카드가 한장인 경우 entry 상태에 머무른다`() {
        val card = HandCard(mutableListOf())
        val actual = FirstTurn(card).draw(Card(CardNumber.EIGHT))
        assertThat(actual).isInstanceOf(FirstTurn(card)::class.java)
    }
}
