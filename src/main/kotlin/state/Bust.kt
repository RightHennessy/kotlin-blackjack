package state

import card.Card
import card.HandCard

class Bust(val handCard: HandCard) : State {
    override fun draw(card: Card): State {
        throw IllegalStateException("더 이상 카드를 뽑지 않습니다")
    }
}
