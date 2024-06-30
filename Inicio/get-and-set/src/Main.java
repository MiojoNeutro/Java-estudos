import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String time;

        Teste escolha = new Teste("p");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fala ai:");
        time = scanner.nextLine();

        escolha.setTime(time);
        escolha.mostraTime();





    }
}