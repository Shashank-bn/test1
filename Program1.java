import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the type of operation (add, sub, mul, div): ");
        String operation = scanner.next().toLowerCase();

        double result = calculate(a, b, operation);
        System.out.println("Result: " + result);

        scanner.close();
    }

    public static double calculate(double a, double b, String operation) {
        switch (operation) {
            case "add":
                return a + b;
            case "sub":
                return a - b;
            case "mul":
                return a * b;
            case "div":
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("Error: Division by zero");
                    break;
                }
            default:
                System.out.println("Error: Invalid operation");
                break;
        }
        return 0;
    }
}
