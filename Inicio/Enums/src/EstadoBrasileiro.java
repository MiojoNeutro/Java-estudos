public enum EstadoBrasileiro {

    Ceara ("CE","Ceara"),
    Sao_Paulo("SP","São Paulo"),
    Espirito_Santos("EP","Espirito Santos");


    private String nome;
    private String sigla;

    private EstadoBrasileiro (String sigla, String nome){
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome.toUpperCase();
    }

    public String getSigla() {
        return sigla.toUpperCase();
    }
}