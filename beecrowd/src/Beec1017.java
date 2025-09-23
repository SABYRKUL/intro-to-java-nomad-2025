import java.util.Scanner;

public class Beec1017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hours = sc.nextInt();
        int speed = sc.nextInt();

        int distance = hours * speed;
        double liters = distance / 12.0;
        System.out.printf("%.3f%n", liters);
    }
}
