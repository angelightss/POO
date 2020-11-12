public class Principiante extends Jogador {

    private double bonus;

    public Principiante(String nome, int score, double bonus) {
        super(nome, score);
        this.bonus = bonus; 
    }


    public void imprimir() {
        super.imprimir();
        System.out.println(bonus);
    }
    
    void ganhar(int p) {
        super.score = score + p;
        bonus = p + (p * 0.10);
    }
    
    void perder(int p) {
        super.score = score - p;
        bonus = p - (p * 0.10);
    }
    
}
