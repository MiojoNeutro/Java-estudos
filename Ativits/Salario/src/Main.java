import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
        //calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
        //(1SM=R$788,00)
        int sm;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();

        System.out.println("Digite o valor do salário do usuário: ");
        double salarioUsuario = scanner.nextDouble();

        for (sm = 0; salarioUsuario > salarioMinimo; sm++){
        salarioUsuario = salarioUsuario - salarioMinimo;
        }
        System.out.println(sm+"SM=R$"+salarioMinimo);



    }
}