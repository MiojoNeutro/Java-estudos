
import java.util.Scanner;

public class Condicional {

// Estrutura condicional
//1 - Escreva um programa que irá pedir 3 números e mostrará qual é o maior deles. 
//2 - Faça um programa que o usuário irá escolher entre 3 opções, 1 - mensagem de boas vindas, 2 - mensagem de despedida, 3  - mensagem de espera. E qualquer outra opção fora 1, 2 ou 3 que o usuário escolher estará errada.

    /*public static void main(String[] args) throws Exception {
       
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("Digite o numero 1:" );
        int n1 = scan.nextInt();
        System.out.println("Digite o numero 2:" );
        int n2 = scan.nextInt();
        System.out.println("Digite o numero 3:" );
        int n3 = scan.nextInt();

        if(n1 > n2 && n1 > n3)
        System.out.println("O maior numero é: "+n1);
        else if (n2 > n1 && n2 > n3) {
            System.out.println("O maior numero é: "+n2);
        }
        else if(n3 > n1 && n3 > n2){
            System.out.println("O maior numero é: "+n3);
        }else{
            System.out.println("Tudo igual mano.");
        }
    } */
 /*   public static void main(String[] args) {
try{
    try (Scanner scan = new Scanner(System.in)) {
        System.out.println("Digite o numero 1:");
        int x = scan.nextInt();

        switch (x) {
            case 1 -> System.out.println("bem vindo");
            case 2 -> System.out.println("vá embora");
            case 3 -> System.out.println("pera ai");
            default -> System.out.println("escolhe outro.");
    
        }
    }
    }catch(Exception e){

    }

    }*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double saldo;
        System.out.println("Quantas vezes vai repetir? ");
        int repetir = scan.nextInt();
        int x = 0;
        while (x <= repetir) { 
            System.out.println("repetindo: "+x);
            x++;
        }  
        System.out.println("Informe o valor a ser depositado:");
                    saldo = scan.nextDouble();
                    System.out.println("Saldo atual: "+ String.format("%.1f", saldo));
    }





}
