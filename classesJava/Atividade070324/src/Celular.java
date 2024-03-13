public class Celular {
    private String marca;
    private String modelo;
    private boolean bloquear;

    public void status(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        
        if (bloquear == true){
            System.out.println("Tela bloqueada.");
        } else {
            System.out.println("Tela desbloqueada.");
        }
    }

    public Celular(String marca, String modelo){
        setMarca(marca);
        setModelo(modelo);
        bloquear = true;
    }

    //Objetos
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isLigado(){
        return bloquear;
    }

    public void setLigado(boolean bloquear) {
        this.bloquear = bloquear;
    }

    //Métodos
    public void desbloquear(){
        if (bloquear == true){
            System.out.println("Você apertou o botão e desbloqueou a tela do celular.");
            bloquear = false;
        }
    }

    public void bloquear(){
        System.out.println("Você apertou o botão e bloqueou a tela.");
        bloquear = true;
    }

    public void desligar(){
        System.out.println("Desligando...\nDesligado!");
    }

}
