import java.util.Scanner;

public class SumOne {


    //輸入一個整數n,並用遞迴求解1+2+3…n之和.
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Number: ");
        int n = scanner.nextInt();
        System.out.printf("Sum: %d", sum(n));
    }

    private static int sum(int n){
        return (n<=0)?0:sum(n-1) + n;
    }
}
