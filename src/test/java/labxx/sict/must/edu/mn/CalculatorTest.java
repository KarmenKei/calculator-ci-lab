package labxx.sict.must.edu.mn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        assertEquals(5.0, calculator.performOperation("nemeh", 2.0f, 3.0f));
    }

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        assertEquals(1.0, calculator.performOperation("hasah", 3.0f, 2.0f));
    }

    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();
        assertEquals(6.0, calculator.performOperation("urjuuleh", 2.0f, 3.0f));
    }

    @Test
    public void testDivision() {
        Calculator calculator = new Calculator();
        assertEquals(2.0, calculator.performOperation("huvaah", 6.0f, 3.0f));
    }

    @Test
    public void testInvalidOperation() {
        Calculator calculator = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.performOperation("invalid", 1.0f, 1.0f);
        });
    }
}
