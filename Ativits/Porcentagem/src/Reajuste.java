import java.util.Scanner;

public class Reajuste {
    public static void main(String[] args) {
        //Informar um saldo e imprimir o saldo com reajuste de 1%


        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        double saldoNovo = saldo + (saldo * 0.1);

        System.out.println(saldoNovo);
    }
}