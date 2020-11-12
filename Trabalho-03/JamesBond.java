public class JamesBond extends Heroi {

    public JamesBond(int cor) {
        super(cor);
    }
    

    @Override
    public void atirar() {
        System.out.print("James Bond ");
        super.atirar();
    }
    
    @Override
    public void saltar(float z){
        super.saltar(z);
    } 
} 