import java.util.Scanner;

public class Beec1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double percent = 0;

        if (n >= 0 && n <= 400){
            percent = 15.0;
        } else if (n >= 400.01 && n <= 800.00) {
            percent = 12.0;
        } else if (n >= 800.01 && n <= 1200.00) {
            percent = 10.0;
        } else if (n >= 1200.01 && n <= 2000.00) {
            percent = 7.0;
        } else {
            percent = 4.0;
        }

        double reajuste = n * percent / 100;
        double new_salary = n + reajuste;

        System.out.printf("Novo salario: %.2f%n", new_salary);
        System.out.printf("Reajuste ganho: %.2f%n", reajuste);
        System.out.printf("Em percentual: %.0f %%%n", percent);
    }
}
