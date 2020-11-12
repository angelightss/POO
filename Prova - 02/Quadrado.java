public class Quadrado extends Forma {

    private double lado;

    public Quadrado(int cor, double lado) {
        super(cor);
        this.lado = lado;
    }
    
    public double getLado() {
        return this.lado;
    }
    
    @Override
    public double area(){
        double area = this.lado * this.lado;
        return area;
    } 

}