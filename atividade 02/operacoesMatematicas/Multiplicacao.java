public class Multiplicacao {
    public String multiplicacao(int numerador1, int denominador1, int numerador2, int denominador2){
        int numerador = numerador1*numerador2;
        int denominador = denominador1*denominador2;

        while (numerador % 2 == 0 && denominador % 2 == 0) {
            numerador=numerador/2;
            denominador=denominador/2;
        }

        return numerador + "/" + denominador;
    }

    public static void main(String[] args) {
        Multiplicacao primeirMultiplicacao = new Multiplicacao();
        String resultado = primeirMultiplicacao.multiplicacao(2, 4, 1, 2);

        System.out.println(resultado);
    }
}
