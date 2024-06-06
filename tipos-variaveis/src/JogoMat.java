import java.util.Scanner;

public class JogoMat{
public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
        for (int tentativa = 0; tentativa <= 4; tentativa++){
            System.out.println("\nQual o resultado da conta 5 x 5? ");
            int resultado = scan.nextInt();
            if(resultado == 25){
                System.out.println("\n==================================");
                System.out.println("\nResultado correto!");
                System.out.println("\n==================================");
                break;
            }else if (tentativa == 4){
                System.out.println("\n==================================");
                System.out.println("\n Acabaram suas tentativas! Melhore.");
                System.out.println("\n==================================");
            }
            else {
                System.out.println("\nResultado incorreto, tente novamente.");
            }
        }
    }
}
}
   










