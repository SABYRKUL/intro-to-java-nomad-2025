import java.util.Scanner;

public class Beec1006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();
        double number3 = sc.nextDouble();



        double media = (number1 * 2 + number2 * 3 + number3 * 5)  / 10.0;


        System.out.printf("MEDIA = %.1f%n", media);
    }
}
