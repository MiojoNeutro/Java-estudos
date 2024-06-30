public class Media {
    public static void main(String[] args) {
        //Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
        //números 4, 5 e 6. A soma das duas médias. A média das médias.

        double mediaUm = (8 + 9 + 7) / 3.0;
        double mediaDois = (4 + 5 + 6) / 3.0;
        double somaMedia = mediaUm + mediaDois;
        double mediaMedia = (mediaUm + mediaDois + somaMedia) / 3.0;

        String mediaMediaFormat = String.format("%.2f", mediaMedia);

        System.out.println("Média do primeiro conjunto: " + mediaUm);
        System.out.println("Média do segundo conjunto: " + mediaDois);
        System.out.println("Soma das médias: " + somaMedia);
        System.out.println("Média das médias: " + mediaMediaFormat);

    }
}