public class Goldfinger extends Terrorista implements Personificacao{

    private Heroi h;

    public Goldfinger(int cor){
        super(cor);
    } 

    @Override
    public void saltar(float z){
        super.saltar(z);
    } 

    @Override
    public void personificar(Heroi h){
        this.h = h;
        System.out.println("Goldfinger Personificado");
    } 
}