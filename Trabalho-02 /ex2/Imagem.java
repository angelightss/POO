package ex2;

public class Imagem extends Documento {

    public Imagem(String nome, int endereco, int total) {
        super(nome, endereco, total);
    }
    
    public void abrir() {
        System.out.println("Abrindo Photoshop");   
    }
}
