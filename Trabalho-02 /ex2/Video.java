package ex2;


public class Video extends Documento {

    public Video(String nome, int endereco, int total) {
        super(nome, endereco, total);
    }

    public void abrir() {
        System.out.println("Abrindo Editor de Vídeo");
    }
}
