public class Garrafa {
    private boolean tampado;
    private String rotulo;
    private boolean lacre;

    public void status(){
        System.out.println("Você está bebendo " + rotulo);

        if (lacre == true){
            System.out.println("lacrado");
        } 

        if (tampado == true){
            System.out.println("tampado");
        } else {
            System.out.println("destampado");
        }
    }

    public Garrafa(String rotulo){
        lacre = true;
        setRotulo(rotulo);
        tampado = true;
    }

    public boolean getTampa(){
        return tampado;        
    }

    public void setTampa(boolean t){
        this.tampado = t;
    }

    public String getRotulo(){
        return rotulo;
    }

    public void setRotulo(String r){
        this.rotulo = r;
    }

    public boolean getLacre(){
        return lacre;
    }

    public void setLacre(boolean l){
        this.lacre = l;
    }

    public void abrir(){
        lacre = false;
        tampado = false;
        System.out.println("Aberto.");
    }

    public void fechar(){
        tampado = true;
        System.out.println("Fechado.");
    }

    public void colocar(){
        if (tampado == false) {
            System.out.println("Enchendo o copo...");
        } else {
            System.out.println("Ta fechado, não pode colocar.");
        }
    }


}
