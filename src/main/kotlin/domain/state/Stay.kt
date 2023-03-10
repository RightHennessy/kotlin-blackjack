package domain.state

import domain.HandCard

class Stay(handCard: HandCard) : EndGame() {
    override val dividendRate: Double = 1.0
}
