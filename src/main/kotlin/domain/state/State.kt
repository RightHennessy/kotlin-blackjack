package domain.state

import domain.Card

// 컴파일러가 interface 내에 draw가 있다는 것을 알기 때문에 draw.draw가 가능해진다
interface State {
    fun draw(card: Card): State
}
