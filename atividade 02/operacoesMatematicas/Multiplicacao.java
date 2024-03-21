public class Multiplicacao {
    public int multiplicacao(int a, int b){
        return a*b;
    }

    public static void main(String[] args) {
        Multiplicacao primeirMultiplicacao = new Multiplicacao();
        int resultado = primeirMultiplicacao.multiplicacao(2, 4);

        System.out.println(resultado);
    }
}
