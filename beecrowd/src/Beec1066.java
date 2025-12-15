import java.util.Scanner;

public class Beec1066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        int positive = 0;
        int negative = 0;


        for (int i = 0; i < 5; i++){
            int num = sc.nextInt();
            if (num > 0){
                positive++;
            } else if (num < 0) {
                negative++;
            }

            if (num % 2 == 0){
                even++;
            } else {
                odd++;
            }
        }

        System.out.println(even + " valor(es) par(es)");
        System.out.println(odd + " valor(es) impar(es)");
        System.out.println(positive + " valor(es) positivo(s)");
        System.out.println(negative + " valor(es) negativo(s)");

    }
}
