import java.util.Scanner;

public class Beec1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSeconds = sc.nextInt();

        int hours = totalSeconds / 3600;
        int r_hours = totalSeconds % 3600;
        int minutes = r_hours / 60;
        int r_minutes = r_hours % 60;
        int seconds = r_minutes / 1;

        System.out.println(hours + " : " + minutes + " : " + seconds);
    }
}
