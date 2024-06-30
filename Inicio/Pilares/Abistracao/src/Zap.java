public class Zap extends MensagensAgora{
    public void enviarMenagem() {
        System.out.println("Enviando mensagm do Zap");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagm do Zap");
    }
}
