import org.example.Calculator;
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class CalculatorTest {

    private lateinit var calculator: Calculator

    @BeforeEach
    fun setUp() {
        calculator = Calculator()
    }

    @Test
    fun testAddition() {
        // Arrange
        val a = 5.0
        val b = 3.0

        // Act
        val result = calculator.add(a, b)

        // Assert
        assertEquals(8.0, result, "Expected 5.0 + 3.0 to equal 8.0")
    }

    @Test
    fun testSubtraction() {
        // Arrange
        val a = 10.0
        val b = 4.0

        // Act
        val result = calculator.subtract(a, b)

        // Assert
        assertEquals(6.0, result, "Expected 10.0 - 4.0 to equal 6.0")
    }

    @Test
    fun testMultiplication() {
        // Arrange
        val a = 2.0
        val b = 3.0

        // Act
        val result = calculator.multiply(a, b)

        // Assert
        assertEquals(6.0, result, "Expected 2.0 * 3.0 to equal 6.0")
    }

    @Test
    fun testDivision() {
        // Arrange
        val a = 10.0
        val b = 2.0

        // Act
        val result = calculator.divide(a, b)

        // Assert
        assertEquals(5.0, result, "Expected 10.0 / 2.0 to equal 5.0")
    }

    @Test
    fun testDivisionByZero() {
        // Arrange
        val a = 10.0
        val b = 0.0

        // Act & Assert
        assertFailsWith<IllegalArgumentException>("Division by zero should throw an exception") {
            calculator.divide(a, b)
        }
    }

    @Test
    fun testAdditionWithNegativeNumbers() {
        val result = calculator.add(-5.0, -3.0)
        assertEquals(-8.0, result)
    }

    @Test
    fun testMultiplicationWithZero() {
        val result = calculator.multiply(7.0, 0.0)
        assertEquals(0.0, result)
    }

    @Test
    fun testLargeNumberMultiplication() {
        val result = calculator.multiply(1e308, 1.0)
        assertEquals(1e308, result)
    }

    @Test
    fun testSmallNumberAddition() {
        val result = calculator.add(1e-308, 1e-308)
        assertEquals(2e-308, result, 1e-310)
    }
}
