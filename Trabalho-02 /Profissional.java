public class Profissional extends Jogador {

    private double capital; 

    public Profissional(String nome, int score, double capital) {
        super(nome, score);
        this.capital = capital; 
    }

    public void imprimir() {
        super.imprimir();
        System.out.println(capital);
    }
    
    void ganhar(int p) {
        super.score = score + p;
        this.capital = capital + (p * 4);
    }
    
    void perder(int p) {
        super.score = score - p;
        this.capital = capital - (p * 4);
    }
    

}
