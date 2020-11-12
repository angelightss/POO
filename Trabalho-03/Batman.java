public class Batman extends Heroi implements Camuflagem {

    public Batman(int cor) {
        super(cor);
    }

    @Override
    public void atirar() {
        System.out.print("Batman ");
        super.atirar();
    }
    
    public void camuflar(int cor) {
        System.out.println("Batman Camuflado");

    }
} 