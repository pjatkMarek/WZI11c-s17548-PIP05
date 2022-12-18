import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wyraz ciagu Fibonacciego ktorego wartosc chcesz wyswietlic:");
        int n = scan.nextInt();

        fibo(n);
    }
    public static void fibo(int n) {
        int fib1 = 1, fib2 = 1, fib3 = 0;

        if (n == 1) {
            fib3 = 1;
        } else if (n >= 2) {
            for (int i = 2; i < n; ++i) {
                fib3 = fib1 + fib2;
                fib1 = fib2;
                fib2 = fib3;
            }
        }
        System.out.println(fib3);
    }
}
