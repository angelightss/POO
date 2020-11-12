package ex2;
import java.util.ArrayList;

public class Compactado {

    ArrayList<Arquivo> arquivosCompact = new ArrayList<Arquivo>();

    public Compactado(String nome) {}
    
    public void abrirArquivos() {
        Pasta novaPasta = new Pasta("PastaCompactada"); 
    }
    
    public void listarArquivos() {
        System.out.println(arquivosCompact);
    }
}
