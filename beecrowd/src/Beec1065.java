import java.util.Scanner;

public class Beec1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        int counter = 0;

        if (a % 2 == 0){
            counter++;
        }
        if (b % 2 == 0){
            counter++;
        }
        if (c % 2 == 0){
            counter++;
        }
        if (d % 2 == 0){
            counter++;
        }
        if (e % 2 == 0){
            counter++;
        }

        System.out.println(counter + " valores pares");
    }
}
