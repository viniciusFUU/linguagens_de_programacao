public class Lampada {
    private double potencia;
    private String tipo;
    private boolean ligado;
    private boolean defeito;

    public void status(){
        System.out.println("Potencia lampada: " + potencia + "w");
        System.out.println("Tipo de lampada: " + tipo);

        if (defeito == true && ligado == false) {
            System.out.println("Luz tá queimada");
        } else if (ligado == false){
            System.out.println("Lamapada Desligada!");
        } else {
            System.out.println("Tá tudo iluminado :D");
        }
    }

    public Lampada(double potencia, String tipo){
        setPotencia(potencia);
        setTipo(tipo);
        this.ligado = false;
        this.defeito = false;
    }

    //Objetos
    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isDefeito() {
        return defeito;
    }

    public void setDefeito(boolean defeito) {
        this.defeito = defeito;
    }

    //Métodos
    public void ligar(){
        System.out.println("Apertou botão.");
        this.ligado = true;
        System.out.println("Ligou.");
    }

    public void desligar(){
        System.out.println("Apertou botão.");
        this.ligado = false;
        System.out.println("Desligou.");
    }

    public void queimou(){
        this.defeito = true;
        this.ligado = false;

        //System.out.println("Queimou a lampada D;, troque-a.");
    }
}
