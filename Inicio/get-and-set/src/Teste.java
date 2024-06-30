public class Teste {
    private String nomeTime;

    public String getNomeTime() {
        return nomeTime;
    }

    public Teste(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public void mostraTime(){
        System.out.printf("Seu time é: %s",getTime());
    }
}
