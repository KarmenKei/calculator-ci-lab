package labxx.sict.must.edu.mn;

public class Division {
    public float divide(float a, float b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }
}