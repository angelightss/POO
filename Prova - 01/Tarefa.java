public class Tarefa {
    static String descricao;
    static boolean finalizada;

    public Tarefa(String descricao) {
        Tarefa.descricao = descricao;
    }
    
    public void alternaFinalizada(boolean a) {
        finalizada = a;
    }
    
    public void mudaFinalizada(boolean fim) {
        finalizada = fim;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public String getDescricao() {
        return descricao; 
    }

    
}
