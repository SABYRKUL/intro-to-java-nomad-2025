import java.util.Scanner;

public class Beec1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double pi = 3.14159;
        double area = pi * r * r;
        System.out.printf("A=%.4f\n", area);
        sc.close();
    }
}
