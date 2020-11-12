package ex2;

import java.util.ArrayList;

public class Pasta {
    private String nome;
    private ArrayList<Arquivo> arquivos = new ArrayList<Arquivo>();

    public Pasta(String nome) {
        this.nome = nome;
    }
    
    public void inserirArquivo(Arquivo arquivonome) {
        arquivos.add(arquivonome);
    }

    public void removerArquivo(String arquivonome) {
        arquivos.remove(arquivonome);
    }

    public void listarArquivos() {
        System.out.println(arquivos);
    }
    
    public Compactado compactar() {
        Compactado novoCompactado = new Compactado("Compactado");
        return novoCompactado;
    }
    
    public void abrirArquivos() {
        Disco k = new Disco('k');
    }
    
    public void duplicarArquivo(String arquivonome) {
        Arquivo duplicado = new Arquivo("Defesa Projeto 2", 27, 3);
        duplicado.abrir("Defesa Projeto 2");
    }
    
    public void imprimirArquivonome(String arquivonome) {
        System.out.println("Nome do arquivo: " + arquivonome); 
    }
    
}
