import java.util.Scanner;

public class Beec1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start_h = sc.nextInt();
        int start_m = sc.nextInt();
        int finish_h = sc.nextInt();
        int finish_m = sc.nextInt();

        int startTotal = start_h * 60 + start_m;
        int finishTotal  = finish_h * 60 + finish_m;

        int durationMinutes;

        if (startTotal == finishTotal){
            durationMinutes = 24 * 60;
        } else if (startTotal < finishTotal) {
            durationMinutes = finishTotal - startTotal;
        } else {
            durationMinutes = (24 * 60 - startTotal) + finishTotal;
        }

        int hours = durationMinutes / 60;
        int minutes = durationMinutes % 60;

        System.out.println("O JOGO DUROU " + hours + " HORA(S) E " + minutes + " MINUTO(S)");
    }
}
