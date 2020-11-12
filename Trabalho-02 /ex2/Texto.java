package ex2;

public class Texto extends Documento {
    
    public Texto(String nome, int endereco, int total) {
        super(nome, endereco, total);
    }

    public void abrir() {
        System.out.println("Abrindo Word 2007");
    }
    
}
