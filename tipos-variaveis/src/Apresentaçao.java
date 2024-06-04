import java.util.Scanner;

public class Apresentaçao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual seu nome? ");
        String nome = scan.next();
        
        System.out.println("Qual a sua idade? ");
        int idade = scan.nextInt();

        System.out.println("Quandos pés vc tem? ");
        int quantidadePe = scan.nextInt();

        System.out.println("Seu nome é: "+nome+"\nSua idade é: "+idade+"\nE sua quantidade de pés é: "+quantidadePe);
        
        scan.close();
    }
}
