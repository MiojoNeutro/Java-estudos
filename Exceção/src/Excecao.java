import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Excecao {
    public static void main(String[] args) throws Exception {
       
        try (Scanner scan = new Scanner(System.in).useLocale(Locale.US)) { 
        
        System.out.println("Qual o seu nome? ");
        String nome = scan.next();

        System.out.println("Qual o seu sobre nome? ");
        String sobreNome = scan.next();

        System.out.println("Qual a sua idade? ");
        int idade = scan.nextInt();

        System.out.println("Qual a sua altura? ");
        double altura = scan.nextDouble();

        System.out.println("Seu nome completo é "+ nome.toUpperCase() +" "+ sobreNome.toUpperCase() +"\nSua idade é: "+ idade +"\nE sua altura é: "+ altura +" cm");

        scan.close();
        } catch(InputMismatchException e){
            System.out.println("Por favor, digitar apenas numero e letras. Em altura utilize '.'");
        }
    }
}
