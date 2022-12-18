import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ilosc gwiazdek w podstawie:");
        int n = scan.nextInt();

        if (n % 2 == 0) {
            n--;
        }

        piramidka(n);
    }

    public static void piramidka(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
