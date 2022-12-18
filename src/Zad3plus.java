import java.util.Scanner;

public class Zad3plus {
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

        for (int i = 0; i < n/1.99; i++) {
            for (int j = n/2 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i*2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
