package labxx.sict.must.edu.mn;

public class Modulus {

    public float mod(float a, float b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot modulus by zero.");
        }
        return a % b;
    }
}