public class Camisa {
    private String marca;
    private String cor;
    private String manga;

    public void status(){

    }

    public Camisa(){

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getManga() {
        return manga;
    }

    public void setManga(String manga) {
        this.manga = manga;
    }

    //Métodos
    public void vestirCamisa(){
        System.out.println("Vestindo.");
    }

    public void retirarCamisa(){
        System.out.println("Retirando a camisa.");
    }

    public String descobrirTipoCamisa(String tipoManga){
        if(tipoManga == "sim"){
            
        }
    }

}
