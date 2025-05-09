package labxx.sict.must.edu.mn;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculator started.");
        while (true) {
            System.out.println("Choose an operation: add, subtract, multiply, divide, modulus. Type 'exit' to quit.");
            String operation = scanner.nextLine();

            if (operation.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
                break;
            }

            System.out.println("Enter first number:");
            float a = scanner.nextFloat();

            System.out.println("Enter second number:");
            float b = scanner.nextFloat();

            scanner.nextLine(); 

            try {
                float result = calculator.performOperation(operation, a, b);
                System.out.println("Result: " + result);
            } catch (IllegalArgumentException | ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
