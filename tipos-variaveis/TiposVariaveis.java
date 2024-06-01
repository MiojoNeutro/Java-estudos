public class TiposVariaveis {
    
    public static void main(String[] args) {
        String primeiroNome = "Roberto";
        String segundoNome = "Conor";
        String ultimoNome = ultimoNome(primeiroNome, segundoNome);
        System.out.println(ultimoNome);
    }public static String ultimoNome(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
