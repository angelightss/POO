class ImprimirFormaConsole implements ImprimirForma {
    
    public void imprimirArea(Forma forma){
        double area = forma.area();
        System.out.println("Cor: " + forma.getCor() + " Area: " + area);
    }

} 