package Jogo;

import Matematica.Vetor2d;

public class Jogador {
    private int numero;
    private Vetor2d posicao;
    
    public Jogador(int num) {
        num = numero;
        Vetor2d posicao = new Vetor2d();
    }
    
    public void mover(Vetor2d var1) {
        posicao.soma(var1);
    }

    public Vetor2d getPosicao() {
        return posicao;
    }
    
}
