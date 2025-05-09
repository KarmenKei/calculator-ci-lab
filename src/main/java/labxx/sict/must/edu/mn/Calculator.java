package labxx.sict.must.edu.mn;
//mvn exec:java -Dexec.mainClass="labxx.sict.must.edu.mn.Main"
public class Calculator {

    private Addition addition;
    private Subtraction subtraction;
    private Multiplication multiplication;
    private Division division;

    public Calculator() {
        this.addition = new Addition();
        this.subtraction = new Subtraction();
        this.multiplication = new Multiplication();
        this.division = new Division();
    }

    public float performOperation(String operation, float a, float b) throws ArithmeticException {
        switch (operation.toLowerCase()) {
            case "nemeh":
                return addition.add(a, b);
            case "hasah":
                return subtraction.subtract(a, b);
            case "urjuuleh":
                return multiplication.multiply(a, b);
            case "huvaah":
                return division.divide(a, b);
            default:
                throw new IllegalArgumentException("Invalid operation.");
        }
    }
}