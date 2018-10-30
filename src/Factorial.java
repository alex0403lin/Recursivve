import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Number:");
        int n = scanner.nextInt();
        System.out.printf("Tatal: %d", factorial(n));
    }

    private static long factorial(int n) {
        return (n <= 0) ? 1 : n * factorial(n - 1);
    }
}
