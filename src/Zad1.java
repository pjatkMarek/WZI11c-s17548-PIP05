import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe n:");
        int n = scan.nextInt();

        loop(n);
    }

    public static void loop(int n) {
        if (n < 0) {
            for (int i = 0; i >= n; i--) {
                System.out.println(i);
            }
        } else {
            for (int i = 0; i <= n; i++) {
                System.out.println(i);
            }
        }
    }
}
