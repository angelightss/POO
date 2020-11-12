public class Coringa extends Ladrao {

    public Coringa(int cor) {
        super(cor);
    }
    
    @Override
    public void atirar() {
        System.out.print("Coringa ");
        super.atirar();
    } 
} 