package domain.state

import domain.Card

abstract class EndGame : State {

    override fun draw(card: Card): State {
        throw IllegalStateException("더 이상 카드를 뽑지 않습니다")
    }
}
