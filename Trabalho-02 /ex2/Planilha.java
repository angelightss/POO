package ex2;


public class Planilha extends Documento {

    public Planilha(String nome, int endereco, int total) {
        super(nome, endereco, total);
    }

    public void abrir() {
        System.out.println("Abrindo Excel");   
    }
    
}
