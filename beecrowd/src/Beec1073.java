import java.util.Scanner;

public class Beec1073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x % 2 != 0){
            x++;
        }

        for (int i=2; i <= x; i+= 2){
            int square = i * i;
            System.out.println(i + "^2" + " = " + square);
        }
    }
}
