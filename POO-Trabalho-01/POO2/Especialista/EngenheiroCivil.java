package Especialista;

import Matematica.Retangulo;

public class EngenheiroCivil {

    static void exibir_dados_pessoais() {
    }
    
    public static void main(String[] args) {

        Retangulo ret = new Retangulo();

        // i. Chama o método exibir_dados_pessoais.
        exibir_dados_pessoais();

        // ii.Chama o método definir_lados da classe Retangulo com os valores 4.7 e 8.2 como parâmetros.
        ret.definir_Lados(4.7, 8.2);

        // iii. Chama os métodos area e perimetro da classe Retangulo e imprime os resultados dessas chamadas.
        ret.getArea();
        System.out.println("A área é: " + ret.getArea());

        ret.getPerimetro();
        System.out.println("O perimetro é: " + ret.getPerimetro()); 
    }
}
