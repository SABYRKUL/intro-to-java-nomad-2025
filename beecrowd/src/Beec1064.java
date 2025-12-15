import java.util.Scanner;

public class Beec1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        double total = 0;

        for (int i = 0; i < 6; i++){
            double num = sc.nextDouble();
            if (num > 0){
                counter++;
                total += num;
            }
        }
        double avarage = total / counter;

        System.out.println(counter + " valores positivos");
        System.out.printf("%.1f\n", avarage);
    }
}
