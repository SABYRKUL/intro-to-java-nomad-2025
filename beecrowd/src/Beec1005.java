import java.util.Scanner;

public class Beec1005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();



        double media = (number1 * 3.5 + number2 * 7.5)  / 11.0;

        System.out.printf("MEDIA = %.5f%n", media);
    }
}
