public class Controle {
    private String tipo;
    private int quantidadeBotoes;
    private boolean ligado;

    public void status(){
        System.out.println("Controle de " + tipo);
        System.out.println("Quantidade de botões: " + quantidadeBotoes);

        if (ligado == true) {
            System.out.println("Ligado.");
        } else {
            System.out.println("Desligado.");
        }
    }

    public Controle(String tipo, int quantidadeBotoes){
        setQuantidadeBotoes(quantidadeBotoes);
        setTipo(tipo);
        this.ligado = false;
    }

    //Objetos
    public int getQuantidadeBotoes() {
        return quantidadeBotoes;
    }

    public void setQuantidadeBotoes(int quantidadeBotoes) {
        this.quantidadeBotoes = quantidadeBotoes;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isLiga() {
        return ligado;
    }

    public void setLiga(boolean ligado) {
        this.ligado = ligado;
    }

    //Métodos
    public void ligar(){
        System.out.println("Apertou o botão power...");
        this.ligado = true;
        System.out.println("Ligou!");
    }
    
    public void desligar(){
        System.out.println("Apertou o botão power...");
        this.ligado = false;
        System.out.println("Desligou!");
    }

    public void troca(){
        if (ligado == true) {
            System.out.println("Apertou o botão de troca de canal...");
            System.out.println("Trocou de canal.");    
        } else {
            System.out.println("Aparelho desligado, impossível fazer alterações.");
        }
    }
}
