import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of x: ");
        int x = scanner.nextInt();
        
        generateSeries(x);
        
        scanner.close();
    }
    
    public static void generateSeries(int a) {
        for (int i = 1; i <= a; i++) {
            System.out.print(2 * i - 1 +" ");
        }
        System.out.println();
    }
}
