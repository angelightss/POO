package ex2;


public class Som extends Documento {
    
    public Som(String nome, int endereco, int total) {
        super(nome, endereco, total);
    }

    public void abrir() {
        System.out.println("Abrindo Media Player"); 
    }
    
}
