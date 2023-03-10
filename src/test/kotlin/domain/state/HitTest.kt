package domain.state

import domain.Card
import domain.CardNumber
import domain.HandCard
import org.assertj.core.api.AssertionsForClassTypes.assertThat
import org.junit.jupiter.api.Test

class HitTest {
    @Test
    fun `카드의 합이 21이 넘으면 bust 상태가 된다`() {
        val card = HandCard(mutableListOf(Card(CardNumber.KING)))
        val actual = FirstTurn(card).draw(Card(CardNumber.TWO)).draw(Card(CardNumber.TEN))
        assertThat(actual).isInstanceOf(Bust(card)::class.java)
    }

    @Test
    fun `카드의 합이 21이 되면 stay 상태가 된다`() {
        val card = HandCard(mutableListOf(Card(CardNumber.KING)))
        val actual = FirstTurn(card).draw(Card(CardNumber.TWO)).draw(Card(CardNumber.NINE))
        assertThat(actual).isInstanceOf(Stay(card)::class.java)
    }
}
