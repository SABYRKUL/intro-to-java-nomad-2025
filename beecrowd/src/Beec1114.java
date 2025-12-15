import java.util.Scanner;

public class Beec1114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int password;
        while (true){
            password = sc.nextInt();
            if (password == 2002){
                System.out.println("Acesso Permitido");
                break;
            } else {
                System.out.println("Senha Invalida");
            }
        }
    }
}
