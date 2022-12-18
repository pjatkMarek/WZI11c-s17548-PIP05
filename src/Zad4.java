public class Zad4 {
    public static void main(String[] args) {
        viewChart(5, 3, 8);
    }

    public static void viewChart(int x, int y, int z) {
        int maxValue = 0;

        if (x > y) {
            if (x > z) {
                maxValue = x;
            } else if (z > y) {
                maxValue = z;
            } else {
                maxValue = y;
            }
        } else if (y > z) {
            maxValue = y;
        } else {
            maxValue = z;
        }

        for (int i = maxValue; i >= 0; i--) {
            if(x <= i) {
                System.out.print(" ");
            } else System.out.print("*");

            if(y <= i) {
                System.out.print(" ");
            } else System.out.print("*");

            if (z <= i) {
                System.out.print(" \n");
            } else System.out.print("*\n");
        }
    }
}
