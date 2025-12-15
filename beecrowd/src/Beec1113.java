import java.util.Scanner;

public class Beec1113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x == y){
                break;
            }
            if (x < y){
                System.out.println("Crescente");
            } else {
                System.out.println("Decrescente");
            }
        }
    }
}
