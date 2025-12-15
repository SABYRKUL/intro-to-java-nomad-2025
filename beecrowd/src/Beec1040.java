import java.util.Scanner;

public class Beec1040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();

        double average = (a * 2 + b * 3 + c * 4 + d * 1) / 10.0;
        average = Math.floor(average * 10) / 10.0;

        System.out.printf("Media: %.1f%n", average);





        if (average >= 7.0){
            System.out.println("Aluno aprovado.");
        } else if (average < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            double e = sc.nextDouble();
            System.out.printf("Nota do exame: %.1f%n", e);
            double new_average = (average + e) / 2.0;
            new_average = Math.floor(new_average * 10) / 10.0;
            if (new_average >= 5.0){
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f%n", new_average);
        }

        sc.close();
    }
}
