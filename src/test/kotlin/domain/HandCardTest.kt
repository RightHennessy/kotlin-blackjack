package domain

import org.assertj.core.api.AssertionsForClassTypes.assertThat
import org.junit.jupiter.api.Test

class HandCardTest {
    @Test
    fun `21을 넘지 않는 경우 Ace를 11로 계산한다`() {
        val actual = HandCard(listOf(Card(CardNumber.ACE), Card(CardNumber.EIGHT)))
        assertThat(actual.getScore()).isEqualTo(19)
    }

    @Test
    fun `21이 넘는 경우 Ace를 1로 계산한다`() {
        val actual = HandCard(listOf(Card(CardNumber.ACE), Card(CardNumber.EIGHT), Card(CardNumber.NINE)))
        assertThat(actual.getScore()).isEqualTo(18)
    }
}
