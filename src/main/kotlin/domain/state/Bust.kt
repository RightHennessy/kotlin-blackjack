package domain.state

import domain.HandCard

class Bust(handCard: HandCard) : EndGame() {
    override val dividendRate: Double = -1.0
}
