public class Camisa {
    private String marca;
    private String cor;
    private String manga;

    public void status(){
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        if (manga == "sim") {
            System.out.println("Tem manga");
        } else {
            System.out.println("Não tem manga.");
        }
    }

    public Camisa(String marca, String cor, String manga){
        setCor(cor);
        setMarca(marca);
        setManga(manga);
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
        System.out.println("Vestindo...");
        System.out.println("Vestido.");
    }

    public void retirarCamisa(){
        System.out.println("Retirando a camisa.");
    }

    public String descobrirTipoCamisa(){
        String regata = "É regata!";
        String camisaSocial = "É camisa social.";

        if(this.manga.equals("sim")){
            return camisaSocial;
        } else {
            return regata;
        }
    }

}
