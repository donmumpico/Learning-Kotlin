package recap

import org.junit.Test

import org.junit.Assert.*

class RecapChallengeKtTest {

    @Test
    fun shouldCheckIfContainsLetter() {
        val wordWithE = "eliminate"
        val wordWithoutE = "forlorn"
        assertTrue(containsLetter(wordWithE, 'e'))
        assertFalse(containsLetter(wordWithoutE, 'e'))
    }
}