package ex2;

import java.util.ArrayList;

public class Disco {
    private char nomeDisco;
    private ArrayList<Pasta> pastas = new ArrayList<Pasta>();

    public Disco(char nome) {
        nome = nomeDisco;
    }
    
    public Pasta criarpasta(String nomepasta) {
        Pasta newpasta = new Pasta(nomepasta);
        pastas.add(newpasta);
        return newpasta;
    }

    public void removerpasta(String nomepasta) {
        pastas.remove(nomepasta);
    }
    
    public void listarpastas() {
        System.out.println(pastas); 
    }
}
