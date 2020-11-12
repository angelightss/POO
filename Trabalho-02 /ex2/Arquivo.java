package ex2;

public class Arquivo {
    String nome;
    int endereco;
    int total;

    public Arquivo(String nome, int endereco, int total){}

    public void abrir(String nome) {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço do Primeiro Bloco em Disco: " + endereco);
        System.out.println("Total de Blocos: " + total);
    }
    
    public void criarReplica(Arquivo arquivonome2) {

    }
    
    public void imprimirNome() {
        System.out.println("Nome: " + nome);
    }
}
