package blackjack.model

object ScoresFactory {
    fun create(scoreValues: List<Int>): Scores {
        val scoreList = scoreValues.map { Score(it) }

        return Scores.Builder().scores(scoreList).build()
    }
}