package ex2;

public class Apresentacao extends Documento {

    public Apresentacao(String nome, int endereco, int total) {
        super(nome, endereco, total);
    }

    public void abrir() {
        System.out.println("Abrindo PowerPoint");   
    }
    
}
