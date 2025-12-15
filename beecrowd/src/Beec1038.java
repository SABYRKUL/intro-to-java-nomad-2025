import java.util.Scanner;

public class Beec1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();

        double price = 0.0;

        if (X == 1){
            price = 4.00;
        } else if (X == 2) {
            price = 4.50;
        } else if (X == 3) {
            price = 5.00;
        } else if (X == 4) {
            price = 2.00;
        } else if (X == 5) {
            price = 1.50;
        }

        double total = price * Y;

        System.out.printf("Total: R$ %.2f%n",  total);
    }
}
