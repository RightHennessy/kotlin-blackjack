package blackjack.domain

object BlackJackReferee {
    const val BLACK_JACK_SCORE = 21

    fun judgeGameResult(players: List<Player>, dealer: Dealer) = players.map { player ->
        PlayerGameResult(
            playerName = player.name.value,
            gameResult = GameResult.valueOf(player.cardHand.getTotalCardsScore(), dealer.cardHand.getTotalCardsScore(), player.cardHand.isBlackJack()),
        )
    }
}
