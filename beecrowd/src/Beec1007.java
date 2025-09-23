import java.util.Scanner;

public class Beec1007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        int number4 = sc.nextInt();



        int d = (number1 *  number2) - (number3 * number4);


        System.out.println("DIFERENCA = " + d);
    }
}
