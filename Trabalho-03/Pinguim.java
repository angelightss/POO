public class Pinguim extends Ladrao {

    public Pinguim(int cor) {
        super(cor);
    }
    

    @Override
    public void atirar() {
        System.out.print("Pinguim ");
        super.atirar();
    }

    @Override
    public void correr(float x, float y) {
        super.correr(x,y);
    } 
    
} 