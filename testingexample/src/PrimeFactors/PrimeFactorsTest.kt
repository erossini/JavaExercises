package PrimeFactors

import org.hamcrest.core.Is.`is`
import org.junit.Assert
import org.junit.Test
import java.util.Collections.emptyList

class PrimeFactorsTest {
    @Test fun factors() {
        Assert.assertThat(factorsOf(1), `is`(emptyList()))
        Assert.assertThat(factorsOf(2), `is`(listOf(2)));
        Assert.assertThat(factorsOf(3), `is`(listOf(3)));
        Assert.assertThat(factorsOf(4), `is`(listOf(2, 2)));
        Assert.assertThat(factorsOf(5), `is`(listOf(5)));
        Assert.assertThat(factorsOf(6), `is`(listOf(2, 3)));
        Assert.assertThat(factorsOf(7), `is`(listOf(7)));
        Assert.assertThat(factorsOf(8), `is`(listOf(2,2,2)));
        Assert.assertThat(factorsOf(9), `is`(listOf(3,3)));
        Assert.assertThat(factorsOf(2 * 2 * 3 * 3 * 5 * 7 * 11 * 11 * 13), `is`(listOf(2, 2, 3, 3, 5, 7, 11, 11, 13)));
    }

    private fun factorsOf(n: Int): List<Int> {
        var remainder = n
        val factors = mutableListOf<Int>()
        var divisor = 2
        while (remainder > 1) {
            while (remainder % divisor == 0) {
                factors.add(divisor)
                remainder /= divisor
            }
            divisor++
        }
        return factors
    }
}