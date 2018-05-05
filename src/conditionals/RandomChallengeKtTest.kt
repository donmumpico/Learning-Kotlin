package conditionals

import org.junit.Test
import kotlin.test.assertTrue

class RandomChallengeKtTest {
    @Test
    fun shouldCalculateRandomNumber() {
        val r = generateRandomNumber()

        assertTrue { r>0 && r<50 }
    }

    @Test
    fun shouldCalculateRange() {
        val r1: Int = 14
        val r2: Int = 24
        val r3: Int = 34
        val r4: Int = 44

        assertTrue { calculateRange(r1) == "in 11-20" }
        assertTrue { calculateRange(r2) == "in 21-30" }
        assertTrue { calculateRange(r3) == "in 31-40" }
        assertTrue { calculateRange(r4) == "larger than 40" }
    }
}

