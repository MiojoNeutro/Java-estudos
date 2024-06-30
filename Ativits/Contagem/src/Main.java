import java.util.Scanner;

public class Main {

    //Escrever um algoritmo que lê:
    //- a porcentagem do IPI a ser acrescido no valor das peças
    //- o código da peça 1, valor unitário da peça 1, quantidade de peças 1
    //- o código da peça 2, valor unitário da peça 2, quantidade de peças 2
    //O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
    //Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Leitura da porcentagem do IPI
            System.out.print("Digite a porcentagem do IPI a ser acrescido: ");
            double ipiPorcentagem = scanner.nextDouble();

            // Leitura dos dados da peça 1
            System.out.print("Digite o código da peça 1: ");
            int codigoPeca1 = scanner.nextInt();
            System.out.print("Digite o valor unitário da peça 1: ");
            double valorUnitarioPeca1 = scanner.nextDouble();
            System.out.print("Digite a quantidade de peças 1: ");
            int quantidadePeca1 = scanner.nextInt();

            // Leitura dos dados da peça 2
            System.out.print("Digite o código da peça 2: ");
            int codigoPeca2 = scanner.nextInt();
            System.out.print("Digite o valor unitário da peça 2: ");
            double valorUnitarioPeca2 = scanner.nextDouble();
            System.out.print("Digite a quantidade de peças 2: ");
            int quantidadePeca2 = scanner.nextInt();

            // Cálculo do valor total sem IPI
            double totalSemIPI = valorUnitarioPeca1 * quantidadePeca1 + valorUnitarioPeca2 * quantidadePeca2;

            // Cálculo do valor total com IPI
            double ipi = ipiPorcentagem / 100.0;
            double totalComIPI = totalSemIPI * (1 + ipi);

            // Saída do resultado
            System.out.printf("Valor total a ser pago (com IPI): R$ %.2f%n", totalComIPI);

            scanner.close();
        }
    }

