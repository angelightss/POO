public class Teste {
    
    public static void main(String[] args) {
        Jogador Ana = new Jogador("Ana Maria", 5);
        Principiante Ale = new Principiante("Ale Vieira", 10, 2.5);
        Profissional Marisa = new Profissional("Marisa", 20, 3.5);
        Senior Ang = new Senior("Angela", 30, 5.5);

        Ana.imprimir();
        Ale.imprimir();
        Marisa.imprimir();
        Ang.imprimir();


        Ale.ganhar(10);
        Ale.perder(3);


        Marisa.ganhar(15);
        Marisa.perder(4);


        Ang.ganhar(20);
        Ang.perder(3);

        System.out.println("------------");
        Ana.imprimir();
        Ale.imprimir();
        Marisa.imprimir();
        Ang.imprimir();


    }

}
