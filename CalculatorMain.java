import java.util.Scanner;

class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return (double) a / b;
    }
}

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();

        System.out.println("\nSelect Operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter your choice (1-4): ");

        int choice = sc.nextInt();
        System.out.println();

        switch (choice) {
            case 1:
                System.out.println("Result (Addition): " + calc.add(a, b));
                break;
            case 2:
                System.out.println("Result (Subtraction): " + calc.subtract(a, b));
                break;
            case 3:
                System.out.println("Result (Multiplication): " + calc.multiply(a, b));
                break;
            case 4:
                System.out.println("Result (Division): " + calc.divide(a, b));
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
