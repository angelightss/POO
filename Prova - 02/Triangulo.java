public class Triangulo extends Forma {

    private double base;
    private double altura;
    private double area;

    public Triangulo (int cor, double base, double altura){
        super(cor);
        this.base = base;
        this.altura = altura;
    } 

    public double getBase() {
        return this.base;
    }

    public double getAltura() {
        return this.altura;
    }

    @Override
    public double area() {
        area = ((this.base * this.altura) / 2);
        return area;
    }
}