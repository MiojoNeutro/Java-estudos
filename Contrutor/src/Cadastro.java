public class Cadastro {
    public static void main(String[] args){
         Pessoa marcos = new Pessoa("Marcos", "123");

         marcos.setEndereco("Rua italia");
         System.out.println("Seu nome é: "+marcos.getNome()+"\nCpf: "+marcos.getCpf()+"\nSeu endereço é: "+marcos.getEndereco());
    }
}
