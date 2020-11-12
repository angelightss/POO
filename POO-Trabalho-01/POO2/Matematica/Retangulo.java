package Matematica;

public class Retangulo {
    
    double ladoV;
    double ladoH;
    double a;
    double p;

    public void definir_Lados(double b, double h) {   
        this.ladoV = b;
        this.ladoH = h; 
    }

    public double getArea() {
        this.a = this.ladoH * this.ladoV;
        return this.a;
    }

    public double getPerimetro() {
        this.p = 2 * (this.ladoH + this.ladoV);
        return this.p;
    }
}
