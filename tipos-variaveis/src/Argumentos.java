
public class Argumentos {

    public static void main(String[] args) {
        int idade = Integer.parseInt(args[2]);
        System.out.println("Seu nome completo é: " + nomeCompleto(args) + "\nSua idade é: " + idade);
    }

    public static String nomeCompleto(String[] args) {
        return args[0] + " " + args[1];
    }
}
