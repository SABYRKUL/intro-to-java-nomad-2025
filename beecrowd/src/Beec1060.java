import java.util.Scanner;

public class Beec1060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;

        for (int i = 0; i < 6; i++){
            double num = sc.nextDouble();
            if (num > 0){
                counter++;
            }
        }

        System.out.println(counter + " valores positivos");
    }
}
