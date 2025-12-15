import java.util.Scanner;

public class Beec1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x % 2 == 0){
            x++;
        }

        for (int i=1; i <= x; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
