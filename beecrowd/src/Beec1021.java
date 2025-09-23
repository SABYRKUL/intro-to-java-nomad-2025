import java.util.Scanner;
import java.util.Locale;
public class Beec1021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double N = sc.nextDouble();
        int valor = (int) Math.round(N * 100);

        int[] notas = {10000, 5000, 2000, 1000, 500, 200};
        int[] moedas = {100, 50, 25, 10, 5, 1};

        System.out.println("NOTAS");
        for (int not : notas){
            int qtd = valor / not;
            System.out.println(qtd + " nota(s) de R$ " + String.format("%.2f", not / 100.0));
        }

        System.out.println("MOEDAS");
        for (int moeda : moedas){
            int qtd = valor / moeda;
            System.out.println(qtd + " nota(s) de R$ " + String.format("%.2f", moeda / 100.0));
        }




    }
}
