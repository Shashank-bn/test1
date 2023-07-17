import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        int x = scanner.nextInt();

        generateSeries(x);

        scanner.close();
    }

    public static void generateSeries(int x) {
        for (int i = 1; i <= x; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
