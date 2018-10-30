import java.util.ArrayList;
import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Input Number: ");
        int n = scanner.nextInt();
        System.out.println("Prime: ");
        for (int x : Prime(n)) {
            System.out.println( x);
        }

    }

    public static ArrayList<Integer> Prime(int n) {
        int i, j;
        boolean isPrime;
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (i = 2; i <= n; i++) {
            isPrime = true;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true) {
                list.add(i);
            }
        }
        return list;
    }
}
