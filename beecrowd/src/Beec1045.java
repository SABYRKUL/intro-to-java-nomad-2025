import java.util.Scanner;
import java.util.Arrays;

public class Beec1045 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double[] sides = {A, B, C};
        Arrays.sort(sides);
        C = sides[0];
        B = sides[1];
        A = sides[2];


        double epsilon = 1e-9;
        if (A >= B + C){
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (Math.abs(A*A - (B*B + C*C)) < epsilon){
                System.out.println("TRIANGULO RETANGULO");
            } else if (A * A > B * B + C * C) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else {
                System.out.println("TRIANGULO ACUTANGULO");
            }


            if (A == B && B == C){
                System.out.println("TRIANGULO EQUILATERO");
            } else if (A == B || B == C || C == A) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}
