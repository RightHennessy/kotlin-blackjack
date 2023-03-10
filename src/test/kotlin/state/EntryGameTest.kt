package state

import card.Card
import card.CardNumber
import card.HandCard
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EntryGameTest {
    @Test
    fun `2장을 받으면 hit 상태가 된다`() {
        val card = HandCard(mutableListOf(Card(CardNumber.FIVE)))
        val actual = EntryGame(card).draw(Card(CardNumber.EIGHT))
        assertThat(actual).isInstanceOf(Hit(card)::class.java)
    }

    @Test
    fun `카드가 한장인 경우 entry 상태에 머무른다`() {
        val card = HandCard(mutableListOf())
        val actual = EntryGame(card).draw(Card(CardNumber.EIGHT))
        assertThat(actual).isInstanceOf(EntryGame(card)::class.java)
    }
}
