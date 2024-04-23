public class Soma{
    public String somaFracoes(int numerador1, int denominador1, int numerador2, int denominador2){
        int numerador = (numerador1*denominador2)+(numerador2*denominador1);
        int denominador = (denominador1*denominador2);

        while (numerador % 2 == 0 && denominador % 2 == 0) {
            numerador=numerador/2;
            denominador=denominador/2;
        }

        return numerador + "/" + denominador;
    }

    public static void main(String[] args) {
        Soma primeirDivisao = new Soma();
        String resultado = primeirDivisao.somaFracoes(2, 5, 3, 7);

        System.out.println(resultado);
    }
}