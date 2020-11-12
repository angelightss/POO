abstract class Forma{ 

    private int cor;

    public Forma(int cor){ 
        this.cor = cor; 
    }
    
    public int getCor() {
        return this.cor;
    }
    
    public abstract double area();

}