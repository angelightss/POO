package Matematica; 

public class Vetor2d {
    private float x, y;
    float valor;
    
    public void definirValores(float a, float b) {
        a = x;
        b = y;
    }

    public void definirX(float a) {
        a = x;
    }

    public void definirY(float b) {
        b = y;
    }
    
    public float valorAbsoluto() {
        float valor;
        valor = ((x * 2) + (y * 2));
        return valor;
    }

    public void imprime() {
        System.out.println(Math.sqrt(valor));
    }

    public void soma(Vetor2d var) {
        float a = valor + x;
        float b = valor + y;
        var.definirValores(a, b);


        
    }
    


    
}
