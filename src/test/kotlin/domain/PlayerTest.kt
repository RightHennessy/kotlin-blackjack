package domain

import blackjack.domain.Card
import blackjack.domain.CardNumber
import blackjack.domain.Cards
import blackjack.domain.DrawState
import blackjack.domain.Player
import blackjack.domain.PlayerName
import blackjack.domain.Shape
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PlayerTest {
    private fun createPlayer(firstCardNumber: CardNumber, secondCardNumber: CardNumber): Player {
        return Player(PlayerName("name"), Cards(listOf(Card(firstCardNumber, Shape.SPADE), Card(secondCardNumber, Shape.SPADE))))
    }

    @Test
    fun `21점을 넘으면 추가적인 카드를 뽑지 못한다`() {
        val player = createPlayer(CardNumber.K, CardNumber.K)

        assertThat(
            player.drawCard()
        ).isEqualTo(DrawState.IMPOSSIBLE)
    }
}
