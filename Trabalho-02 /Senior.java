public class Senior extends Profissional {

    private double premio;

    public Senior(String nome, int score, double premio) {
        super(nome, score, premio);
        this.premio = premio;

    }
    
    public void imprimir() {
        super.imprimir();
        System.out.println(premio);
    }
    
    void ganhar(int p) {
        super.ganhar(p);
        premio = premio * 2; 
    }
    
    void perder(int p) {
        super.perder(p);
        premio = premio / 2; 
    }
    
}
