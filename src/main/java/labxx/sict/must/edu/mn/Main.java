package labxx.sict.must.edu.mn;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tooni mashin aslaa..");
        while (true) {
            System.out.println("Uildel songono uu: nemeh, hasah, urjuuleh, huvaah, esvel garah bol 'exit' gej bich.");
            String operation = scanner.nextLine();

            if (operation.equalsIgnoreCase("exit")) {
                System.out.println("Garlaa..");
                break;
            }

            System.out.println("Ehnii noimor oruulna uu:");
            float a = scanner.nextFloat();

            System.out.println("Daraagiin noimor oruulna uu:");
            float b = scanner.nextFloat();

            scanner.nextLine(); 

            try {
                float result = calculator.performOperation(operation, a, b);
                System.out.println("Hariu: " + result);
            } catch (IllegalArgumentException | ArithmeticException e) {
                System.out.println("Aldaa: " + e.getMessage());
            }
        }

        scanner.close();
    }
}