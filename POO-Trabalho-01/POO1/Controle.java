public class Controle {
    public static void main(String[] args) {
        int cor = Semaforo.MostraCor();
    
        // Imprime a cor do semáforo: 
        System.out.println("Cor do Semáforo: " + cor);

        // Repete 10x: Muda cor do semáforo para próxima cor e Imprime a cor do semáforo 
        for (cor = 1; cor < 10; cor++) {
            Semaforo.MudaProximaCor();
        }

        // Fixa a cor do semaforo em amarelo = 1
        cor = 1; 
        Semaforo.MudaCorFixa(cor);

        //Imprime a cor do semáforo 
        System.out.println("Cor fixa do Semáforo: " + cor);

    }
    
}