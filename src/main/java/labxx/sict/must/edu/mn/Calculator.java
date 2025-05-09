package labxx.sict.must.edu.mn;

public class Calculator {

    private Addition addition;
    private Subtraction subtraction;
    private Multiplication multiplication;
    private Division division;
    private Modulus modulus;

    public Calculator() {
        this.addition = new Addition();
        this.subtraction = new Subtraction();
        this.multiplication = new Multiplication();
        this.division = new Division();
        this.modulus = new Modulus();
    }

    public float performOperation(String operation, float a, float b) throws ArithmeticException {
        switch (operation.toLowerCase()) {
            case "add":
                return addition.add(a, b);
            case "subtract":
                return subtraction.subtract(a, b);
            case "multiply":
                return multiplication.multiply(a, b);
            case "divide":
                return division.divide(a, b);
            case "modulus":
                return modulus.mod(a, b);
            default:
                throw new IllegalArgumentException("Invalid operation.");
        }
    }
}