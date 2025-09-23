import java.util.Scanner;

public class Beec1016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();
        int time = distance * 2;
        System.out.println(time + " minutos");
        sc.close();
    }
}
