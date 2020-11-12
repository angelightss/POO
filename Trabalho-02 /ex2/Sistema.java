package ex2;


public class Sistema {

    public static void main(String[] args) {
        
        Disco d = new Disco('C');
        
        Pasta escola = d.criarpasta("Escola");
        Pasta pessoal = d.criarpasta("Pessoal");

        Texto texto = new Texto("Trabalho", 8, 4);
        escola.inserirArquivo(texto);


        Apresentacao a = new Apresentacao("Defesa Projeto 2", 27, 3);
        escola.inserirArquivo(a);


        Planilha p = new Planilha("Calculo 2", 40, 6);
        escola.inserirArquivo(p);

        escola.listarArquivos();

        Video v = new Video("Aniversario", 33, 5);
        pessoal.inserirArquivo(v);

        Imagem i = new Imagem("Foto RJ", 70, 2);
        pessoal.inserirArquivo(i);
        
        pessoal.listarArquivos();
        
        Compactado k = pessoal.compactar();
        
        d.listarpastas();
        
        d.removerpasta("Pessoal");
        
        k.abrirArquivos();
        
        d.listarpastas();

        escola.abrirArquivos();
        pessoal.abrirArquivos();
        
        escola.removerArquivo("Trabalho 10");
        escola.duplicarArquivo("Defesa Projeto 2");

        escola.listarArquivos();

    }
    
}
