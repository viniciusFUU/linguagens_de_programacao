public class App {
    public static void main(String[] args){
        //Carro
        Carro c1 = new Carro("Chevrolet", "Classic", "Chumbo");
        System.out.println("\n");
        c1.status();
        c1.ligar();
        c1.desligar();
        c1.trancar();

        // Caneta
        Caneta cn1 = new Caneta("Faber Castell", "Vermelha", "Há tinta");
        System.out.println("\n");
        cn1.status();
        cn1.tampar();
        cn1.destampar();
        cn1.escrever();

        //Tenis
        Tenis meuTenis = new Tenis("Nike", "Cinza", "Cano médio");
        System.out.println("\n");
        meuTenis.status();
        meuTenis.desamarrar();
        meuTenis.calcar();
        meuTenis.amarrar();
    }
}
