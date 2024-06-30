import java.util.Scanner;

public class CalculadorIdade {
    public static void main(String[] args) {
        //Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
        //mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
        //(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)

        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite quantos anos, meses e dias você tem: ");
        int idade = scanner.nextInt();
        int mes = scanner.nextInt();
        int dias = scanner.nextInt();

        int resultado = (365*idade)+(30*mes)+dias;

        System.out.println("Sua idade em dias é: "+ resultado);
    }
}