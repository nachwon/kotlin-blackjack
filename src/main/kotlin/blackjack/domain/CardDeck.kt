package blackjack.domain

class CardDeck {
    private val _cards: MutableList<Card> = setupCards()
    val cards: List<Card>
        get() = _cards.deepCopy()

    fun drawOne(): Card {
        return _cards.removeLast()
    }

    fun drawMany(drawCount: Int): List<Card> {
        return (1..drawCount).map { _cards.removeLast() }
    }

    private fun setupCards(): MutableList<Card> {
        val cards = CardSymbol.values().flatMap { symbol ->
            CardNumber.NUMBER_RANGE.map { Card(symbol, CardNumber(it)) }
        }
        return cards
            .shuffled()
            .toMutableList()
    }

    private fun List<Card>.deepCopy() = this.map { it.copy() }
}