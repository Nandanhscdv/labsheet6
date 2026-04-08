import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class New {
    Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
    }

    @Test
    void testSubtract() {
        assertEquals(2, calculator.subtract(5, 3), "5 - 3 should equal 2");
    }

    @Test
    void testMultiply() {
        assertEquals(15, calculator.multiply(3, 5), "3 * 5 should equal 15");
    }

    @Test
    void testDivide() {
        assertEquals(2.5, calculator.divide(5, 2), "5 / 2 should equal 2.5");
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }
}
