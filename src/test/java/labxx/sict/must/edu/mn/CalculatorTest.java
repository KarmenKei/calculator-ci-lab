package labxx.sict.must.edu.mn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        assertEquals(5.0f, calculator.performOperation("add", 2.0f, 3.0f));
    }

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        assertEquals(1.0f, calculator.performOperation("subtract", 3.0f, 2.0f));
    }

    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();
        assertEquals(6.0f, calculator.performOperation("multiply", 2.0f, 3.0f));
    }

    @Test
    public void testDivision() {
        Calculator calculator = new Calculator();
        assertEquals(2.0f, calculator.performOperation("divide", 6.0f, 3.0f));
    }

    @Test
    public void testInvalidOperation() {
        Calculator calculator = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.performOperation("invalid", 1.0f, 1.0f);
        });
    }

    @Test
    void testDivisionByZero() {
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> calculator.performOperation("divide", 10.0f, 0.0f));
    }

    @Test
    void testModulus() {
        Calculator calculator = new Calculator();
        assertEquals(1.0f, calculator.performOperation("modulus", 10.0f, 3.0f));
    }
    @Test
    void testModulusByZero() {
    Calculator calculator = new Calculator();
    assertThrows(ArithmeticException.class, () -> calculator.performOperation("modulus", 10.0f, 0.0f));
    }
}