public class ContaCorrente {
    private int numero;
    private double saldo;
    private String cliente;

    
    public void Construtor(String nome, int numero) {
        cliente = nome;
        this.numero = numero;
    }

    public void setDepositar(double saldo) {
        this.saldo = saldo;
    }

    public double getDepositar(double saldo) {
        return saldo;
    }
    
    public double setRetirar(double amount) {
        saldo = saldo - amount;
        while (amount > saldo) {
            System.out.println("Essa operação nao pode ser feita!");
        }
        return saldo;
    }


    public double getVerificarSaldo() {
        return saldo;
    }

    public void getImprimir() {
        System.out.println("Titular: " + cliente);
        System.out.println("Conta: " + numero);
        System.out.println("Saldo: " + getVerificarSaldo());
    }


    
}