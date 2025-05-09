package labxx.sict.must.edu.mn;

import org.junit.jupiter.api.*;
import java.io.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;

    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    @BeforeEach
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    private String getOutput() {
        return testOut.toString();
    }

    @AfterEach
    public void restoreSystemIO() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    @Test
    public void testAdditionAndExit() {
        String input = String.join("\n",
                "add",      // Operation
                "5",        // First number
                "2",        // Second number
                "exit"      // Exit
        );
        provideInput(input);

        Main.main(new String[]{});

        String output = getOutput();
        assertTrue(output.contains("Result: 7.0"), "Output should contain correct addition result.");
        assertTrue(output.contains("Exiting..."), "Output should contain 'Exiting...'");
    }

    @Test
    public void testInvalidOperation() {
        String input = String.join("\n",
                "invalidOp",
                "1",
                "1",
                "exit"
        );
        provideInput(input);

        Main.main(new String[]{});

        String output = getOutput();
        assertTrue(output.contains("Error: Invalid operation."), "Should show error for invalid operation.");
    }

    @Test
    public void testDivisionByZero() {
        String input = String.join("\n",
                "divide",
                "10",
                "0",
                "exit"
        );
        provideInput(input);

        Main.main(new String[]{});

        String output = getOutput();
        assertTrue(output.toLowerCase().contains("error"), "Should display error for division by zero.");
    }
}