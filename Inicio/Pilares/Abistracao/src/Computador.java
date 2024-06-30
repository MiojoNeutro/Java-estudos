public class Computador {
    public static void main(String[] args) {
        Zap zap = new Zap();
        zap.enviarMenagem();
        zap.receberMensagem();

        Face face = new Face();
        face.enviarMenagem();
        face.receberMensagem();

        Inta inta= new Inta();
        inta.enviarMenagem();
        inta.receberMensagem();

    }
}
