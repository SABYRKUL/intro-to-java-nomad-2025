import java.util.Scanner;

public class Beec1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int valor = N;

        int[] notas = {100, 50, 20, 10, 5, 2, 1};

        for (int not : notas){
            int ddd = valor / not;
            System.out.println(ddd + " nota(s) de R$ " + not + ",00");
            valor = valor % not;

        }

    }
}
