import java.util.Scanner;

public class Beec1142 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = 1;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(number + " ");
                number++;
            }
            System.out.println("PUM");
            number++;
        }
        sc.close();
    }
}
