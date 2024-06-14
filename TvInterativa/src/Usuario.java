
import java.util.Scanner;

public class Usuario {

    public static void main(String[] args) {
        int x = 0;
        boolean repetidor, ganbiarra;
        Scanner scan = new Scanner(System.in);
        TvConfig tvConfig = new TvConfig();
        /* Esse algoritimo faz uma imitação de algumas funcionalidades
 * de uma televisão. Como visto no menu, é possível ligar, desligar,
 * aumentar e diminuir canais e volume, além de poder escolher um canal
 * expecifico.
         */

        while (true) {
            if (x == 0) {

                //Menu de opções
                System.out.println("==========================");
                System.out.println("-- Televisão interativa --");
                System.out.println("==========================");
                System.out.println("--> Teclas <--\n");
                System.out.println("Power = 1");
                System.out.println("Aumentar canal = 2");
                System.out.println("Diminuir canal = 3");
                System.out.println("Canal específico = 4");
                System.out.println("Aumentar volume = 5");
                System.out.println("Diminuir volume = 6");
                System.out.println("Tirar da tomada = 7");
                System.out.println("Help = 0");
                System.out.println("==========================");
            }
            ganbiarra = true;
            System.out.println("Digite a função desejada:");
            System.out.println("==========================");
            x = scan.nextInt();
            if (x < 0 || x > 7) {
                System.out.println("==========================");
                System.out.println("\nFunção inexistente!\n");
                System.out.println("==========================");
            }
            if (x == 1 && tvConfig.ligarDesligar == true) {
                tvConfig.ligar();
                System.out.println("==========================");
                System.out.println("\nTelevisão Desligada!!\n");
                System.out.println("==========================");
            } else if (x == 1 && tvConfig.ligarDesligar == false) {
                tvConfig.ligar();
                System.out.println("==========================");
                System.out.println("\nTelevisão ligada!!\n");
                System.out.println("==========================");
            }
            //Apresenta uma instrução ao usuário, é necessário ligar a tv para usa-lá.
            if (x >= 2 && x <= 6 && tvConfig.ligarDesligar == false) {
                System.out.println("==========================");
                System.out.println("\nPor favor, ligue a televisão!!");
                System.out.println("\n==========================");
            }
            //Esse while faz ser obrigatório que a tv esteja ligada.
            while (tvConfig.ligarDesligar == true && ganbiarra == true) {
                //Impede com que o canal seja menor que 0 ou maior que 20.
                if (x == 2 && tvConfig.canal == 20 || x == 3 && tvConfig.canal == 0) {
                    System.out.println("==========================");
                    System.out.println("Não é possível mudar de canal!!");
                    System.out.println("==========================");
                } else if (x == 2) {
                    //Aumenta o volume.
                    tvConfig.aumentarCanal();
                    System.out.println("==========================");
                    System.out.println("\nCanal atual é: " + tvConfig.canal);
                    System.out.println("\n==========================");
                } else if (x == 3) {
                    //Diminui o volume.
                    tvConfig.diminuirCanal();
                    System.out.println("==========================");
                    System.out.println("\nCanal atual é: " + tvConfig.canal);
                    System.out.println("\n==========================");
                }
                if (x == 4) {
                    //Seleciona um canal específico.
                    System.out.println("==========================");
                    System.out.println("\nPara qual canal deseja alterar? ");
                    System.out.println("\n==========================");
                    tvConfig.canal = scan.nextInt();
                    //Caso o numero do canal seja menor que 0 ou maior que 20 será esse erro.
                    if (tvConfig.canal < 0 || tvConfig.canal > 20) {
                        repetidor = true;
                        while (repetidor == true) {
                            System.out.println("==========================");
                            System.out.println("\nCanal inexiste, digite um canal valido: ");
                            System.out.println("\n==========================");
                            tvConfig.canal = scan.nextInt();
                            if (tvConfig.canal >= 0 && tvConfig.canal <= 20) {
                                //Assim que for digitado um numero valido, irá apresentar.
                                System.out.println("==========================");
                                System.out.println("\nCanal atual é: " + tvConfig.canal);
                                System.out.println("\n==========================");
                                repetidor = false;
                            }
                        }
                    } else {
                        //Se o canal for valido, será mostrado o numero do canal.
                        System.out.println("==========================");
                        System.out.println("\nCanal atual é: " + tvConfig.canal);
                        System.out.println("\n==========================");
                    }
                }
                if (x == 5 && tvConfig.volume == 100 || x == 6 && tvConfig.volume == 0) {
                    //Impede que o volume seja maior que 100 ou menor que 0.
                    System.out.println("==========================");
                    System.out.println("\nNão é possível mudar o volume!!");
                    System.out.println("\n==========================");
                } else if (x == 5) {
                    //Aumenta o volume
                    tvConfig.aumentarVolume();
                    System.out.println("==========================");
                    System.out.println("\nO volume atual é: " + tvConfig.volume);
                    System.out.println("\n==========================");
                } else if (x == 6) {
                    //Diminui o volume
                    tvConfig.diminuirVolume();
                    System.out.println("==========================");
                    System.out.println("\nO volume atual é: " + tvConfig.volume);
                    System.out.println("\n==========================");
                }
                if (x == 7) {
                    //Finaliza o código.
                    System.out.println("==========================");
                    System.out.println("\nRetirando da tomad...");
                    System.out.println("\n==========================");
                    scan.close();
                    System.exit(0);
                }
                ganbiarra = false;
            }
        }
    }
}
