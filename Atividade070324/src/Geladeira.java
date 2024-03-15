public class Geladeira {
    private boolean fechada;
    private int altura;
    private int largura;

    public void status(){
        System.out.println("Altura: " + altura);
        System.out.println("Largura: " + largura);
        if (fechada == true){
            System.out.println("Geladeira fechada.");
        } else {
            System.out.println("Geladeira aberta.");
        }
    }

    public Geladeira(int altura, int largura){
        setAltura(altura);
        setComprimento(largura);
        fechada = true;
    }

    //Objetos
    public boolean isFechada(){
        return fechada;
    }

    public void setFechada(boolean f){
        this.fechada = f;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getComprimento() {
        return largura;
    }

    public void setComprimento(int largura) {
        this.largura = largura;
    }

    //Metodos
    public void abrindo(){
        if (fechada == true) {
            System.out.println("Abrindo a porta...");
        } else {
            System.out.println("Porta já está aberta.");
        }

        fechada = false;

        System.out.println("Porta aberta :)");
    }

    public void fechar(){
        if (fechada == false) {
            System.out.println("Fechando...");
        } else {
            System.out.println("Porta já está fechada.");
        }

        fechada = true;
    }

    public void resfriando(){
        if (fechada == true){
            System.out.println("Está resfriando.");
        } else {
            System.out.println("Com a porta aberta não resfria.");
        }
    }
}
