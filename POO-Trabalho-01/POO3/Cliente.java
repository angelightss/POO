public class Cliente {
    private String nome;
    private ContaCorrente contaCorrente;

    ContaCorrente cc = new ContaCorrente();

    public void setConstrutor(String nome, int contaCorrente) {
        cc.Construtor(nome, contaCorrente);
        this.nome = "angela";
        this.contaCorrente = cc;
    }
    
    public void Operar() {

        cc.setDepositar(150.00);
        
        cc.setRetirar(20.00); 

        cc.getVerificarSaldo();

        cc.getImprimir(); 
    }
}
