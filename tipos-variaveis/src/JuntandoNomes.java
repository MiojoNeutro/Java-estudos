public class JuntandoNomes {
    
    public static void main(String[] args) {
        
        String primeiroNome = "CoCo";
        String segundoNome = "congelado";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    } public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
        
    }
}
