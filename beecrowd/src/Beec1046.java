import java.util.Scanner;

public class Beec1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int finish = sc.nextInt();

        int sutki = 24;
        int result = 0;

        if (start == finish){
            result = sutki;
        } else if (start > finish) {
            result = finish + sutki - start;
        } else if (start < finish) {
            result = finish - start;
        }

        System.out.println("O JOGO DUROU " + result + " HORA(S)");
    }
}
