public class Usuario {
    
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("A tv está liga? " +smartTv.ligada);
        System.out.println("O volume atual é: "+smartTv.volume);
        System.out.println("O canal atual é: "+smartTv.canal);

        smartTv.ligar();
        System.out.println("\n\nA tv está ligada? "+smartTv.ligada);
        smartTv.desligar();
        System.err.println("A tv está ligada? "+smartTv.ligada);

        smartTv.diminuirVolume();
        System.err.println("\nO volume atual é: "+smartTv.volume);
        smartTv.aumentarVolume();
        System.err.println("O volume atual é: "+smartTv.volume);

        smartTv.aumentarCanal();
        System.err.println("\nO canal atual é: "+smartTv.canal);
        smartTv.diminuirCanal();
        System.err.println("O canal atual é: "+smartTv.canal);
    }
}
