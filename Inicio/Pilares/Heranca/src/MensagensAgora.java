public class MensagensAgora {
    public void enviar() {
        testar();
        System.out.println("Enviando um texto");
        salvar();
    }

    private void testar() {
        System.out.println("Testando a conexao");
    }

    private void salvar() {
        System.out.println("Salvando no historico");
    }

    public void receber() {
        System.out.println("\nRecebendo um texto\n");
    }
}