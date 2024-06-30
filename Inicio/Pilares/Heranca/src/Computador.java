public class Computador {
    public static void main(String[] args) {
        Zap zap = new Zap();
        Face face = new Face();
        Instagram instagram = new Instagram();

        zap.enviar();
        zap.receber();

        face.enviar();
        face.receber();

        instagram.enviar();
        instagram.receber();
    }
}
