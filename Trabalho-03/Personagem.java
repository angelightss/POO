abstract class Personagem {

    private boolean vivo;
    private float posicaoX;
    private float posicaoY;
    private float posicaoZ;
    private int cor;

    public Personagem(int cor) {
        this.cor = cor;
        this.vivo = true;
        this.posicaoX = 0.0f;
        this.posicaoY = 0.0f;
        this.posicaoZ = 0.0f;
    } 

    public boolean getStatePersonagem() {
        return this.vivo;
    } 

    protected void correr(float x, float y){
        this.posicaoX = x;
        this.posicaoY = y;
    } 

    protected void saltar(float z){
        this.posicaoZ = z;
    } 

    protected void atirar() {
        System.out.print("Atirando ...");
    } 

    protected void morrer() {
        this.vivo = false;
    } 

}