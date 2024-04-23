public class Carro {
    private String fabricante;    
    private String modelo;
    private String cor;

    public void status(){
        System.out.println("O fabricante do carro é " + fabricante);
        System.out.println("O modelo do carro é " + modelo);
        System.out.println("A cor do carro é " + cor);
    }

    //Construtor
    public Carro(String f, String m, String c){
        setFabricante(f);
        setModelo(m);
        setCor(c);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String c) {
        this.cor = c;
    }
    
    public String getFabricante(){
        return fabricante;
    }

    public void setFabricante(String f){
        this.fabricante = f;
    }
    
    //Métodos 
    public void ligar(){
            System.out.println("Ligando o carro...");
    }

    public void desligar(){
        System.out.println("Carro desligado");
    }

    public void trancar(){
            System.out.println("Trancando...");
            System.out.println("Trancado!");
    }
}