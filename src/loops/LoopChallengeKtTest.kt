package loops

import org.junit.Test

import org.junit.Assert.*

class LoopChallengeKtTest {

    @Test
    fun shouldCalculateSumOfNumbers() {
        assertTrue(calculateSumOfNumbers(1, 2) == 3L)
        assertTrue(calculateSumOfNumbers(1, 3) == 6L)
        assertTrue(calculateSumOfNumbers(1, 4) == 10L)
        assertTrue(calculateSumOfNumbers(5, 8) == 26L)
        assertFalse(calculateSumOfNumbers(5, 9) == 34L)
    }
}