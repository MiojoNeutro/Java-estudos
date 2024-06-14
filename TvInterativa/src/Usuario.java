
import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        int x = 0;
        Scanner scan = new Scanner(System.in);
        TvConfig tvConfig = new TvConfig();


        while(true){
        if (x == 0){
        System.out.println("==========================\n");
        System.out.println("-- Televisão interativa --\n");
        System.out.println("==========================\n");
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
        
        System.out.println("\nDigite a função desejada:");
        x = scan.nextInt();
        if (x < 0 || x > 7){
            System.out.println("\nFunção inexistente!");
        }
        if(x == 1 && tvConfig.ligarDesligar == true){
            tvConfig.ligar();
            System.out.println("\nTelevisão ligada!!!\n");
        }else if(x == 1 && tvConfig.ligarDesligar == false){
            tvConfig.ligar();
            System.out.println("\nTelevisão desligada...\n");
        }if (x == 2) {
            tvConfig.aumentarCanal();
            System.out.println("\nCanal atual é: "+ tvConfig.canal);
        }if(x == 3 && tvConfig.canal >= 0 && tvConfig.canal <= 7){
            tvConfig.diminuirCanal();
            System.out.println("\nCanal atual é: "+ tvConfig.canal);
        }if(x == 4){
            System.out.println("\nPara qual canal deseja alterar? ");
            tvConfig.canal = scan.nextInt();
            System.out.println("\nCanal atual é: "+tvConfig.canal);
        }if (x == 5) {
            tvConfig.aumentarVolume();
            System.out.println("\nO volume atual é: "+tvConfig.volume);
        }if (x == 6) {
            tvConfig.diminuirVolume();
            System.out.println("\nO volume atual é: "+tvConfig.volume);
        }if (x == 7) {
            System.out.println("Retirando da tomad...");
           break;
        }
      }scan.close();
    } 
}
