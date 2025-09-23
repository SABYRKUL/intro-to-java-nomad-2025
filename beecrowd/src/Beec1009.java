import java.util.Scanner;

public class Beec1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double salary = sc.nextDouble();
        double total_per_a_month = sc.nextDouble();
        double commission =  total_per_a_month * 0.15;
        double TOTAL = salary + commission;

        System.out.printf("TOTAL = R$ %.2f%n", TOTAL);
    }
}
