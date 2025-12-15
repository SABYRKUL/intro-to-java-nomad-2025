import java.util.Scanner;

public class Beec1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int start = Math.min(x, y);
        int end = Math.max(x, y);
        int counter = 0;

        for (int i = start + 1; i < end; i++){
            if (i % 2 != 0){
                counter += i;

            }
        }

        System.out.println(counter);
    }
}
