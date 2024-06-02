public class TiposVariaveis {
    public static void main(String[] args) {
        
        //Caso a váriavel não consiga conportar a quantidade de outra variável, acarretará em um erro.
        //final: declara uma constante
        //cast é usado para rodar o algoritimo mesmo assim.

        short n1 = 1;
        int numeroFinal = n1;
        short n2 = (short) numeroFinal; 
        System.out.println(n2);

        final double VALOR_DE_PI = 3.1415;
        System.out.println(VALOR_DE_PI);
    }

}