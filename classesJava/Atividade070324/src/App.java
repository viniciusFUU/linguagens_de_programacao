public class App {
    public static void main(String[] args){
        //Carro
        // Carro c1 = new Carro("Classic", "Cinza");
        // c1.status();
        // c1.ligar();
        // c1.ligar();
        // c1.desligar();
        // c1.trancar();

        // Caneta
        // Caneta cn1 = new Caneta("Faber Castell", "Vermelha");
        // cn1.status();
        // cn1.destampar();
        // cn1.escrever();
        // cn1.escrever();

        // Tenis meuTenis = new Tenis("Sola Esportiva", "Cadarço Branco");
        // meuTenis.desamarrar();
        // meuTenis.calcar();
        // meuTenis.status();

        // Garrafa g1 = new Garrafa("Guaraná");
        // g1.status();
        // g1.colocar();
        // g1.abrir();
        // g1.colocar();
        // g1.fechar();

        Geladeira gela1 = new Geladeira(180, 60);
        gela1.abrindo();
        gela1.resfriando();
        gela1.fechar();
        gela1.status();
    }
}
