public class Semaforo {
    // Cor representada com um valor inteiro 
    static int cor = 0; 

    // Método sem parametro e sem retorno
    static void MudaProximaCor() {
        for (cor = 0; cor < 3; cor++) {
            System.out.println("Muda cor do Semáforo: " + cor);
        }
    }

    //Com parametro inteiro e sem retorno fixa cor
    static void MudaCorFixa(int cor) {
        cor = cor;
    }

    //Imprime cor fixa do semaforo 
    static int MostraCor() {
        return cor;
    }
    
}
