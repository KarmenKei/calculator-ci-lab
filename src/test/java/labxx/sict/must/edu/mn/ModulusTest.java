package labxx.sict.must.edu.mn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ModulusTest {

    @Test
    public void testModulusNormal() {
        Modulus mod = new Modulus();
        assertEquals(1.0f, mod.mod(10.0f, 3.0f));
    }

    @Test
    public void testModulusByZero() {
        Modulus mod = new Modulus();
        assertThrows(ArithmeticException.class, () -> mod.mod(10.0f, 0.0f));
    }
}