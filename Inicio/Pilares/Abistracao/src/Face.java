public class Face extends MensagensAgora{
    public void enviarMenagem() {
        System.out.println("Enviando mensagm do Face");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagm do Face");
    }
}
