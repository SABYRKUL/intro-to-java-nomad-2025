import java.util.Scanner;

public class Beec1043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a + b > c && b + c > a && c + a > b){
            double perimeter = a + b + c;
            System.out.printf("Perimetro = %.1f%n", perimeter);
        } else {
            double area = ((a + b) * c) / 2;
            System.out.printf("Area = %.1f%n", area);
        }
    }
}
