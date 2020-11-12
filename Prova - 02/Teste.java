public class Teste {
    public static void main(String[] args) {

        ImprimirFormaConsole shapes = new ImprimirFormaConsole();

        Quadrado rosa = new Quadrado(1,10.0);
        Triangulo purple = new Triangulo(2,20.0f,10.0);

        shapes.imprimirArea(rosa);
        shapes.imprimirArea(purple);

    }
}
