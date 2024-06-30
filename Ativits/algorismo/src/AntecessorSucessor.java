import java.util.Scanner;

public class AntecessorSucessor {
    public static void main(String[] args) {
        //Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
        //antecessor e seu sucessor.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        System.out.println("O antecessor e: "+(numero-1)+"\nE o sucessor e: "+(numero+1));
    }
}