public class TarefaControle {

    private static void imprimeTarefa(Tarefa trfa1) {
        if (trfa1.isFinalizada() == true) {
            System.out.println(trfa1.getDescricao() + trfa1.isFinalizada());
        } else {
            System.out.println(trfa1.getDescricao());
            }
        }

    

    public static void main(String[] args) {
        Tarefa trfa1 = new Tarefa("Tarefa 01 ");
        
        trfa1.alternaFinalizada(true);

        imprimeTarefa(trfa1);


    }
    
}
