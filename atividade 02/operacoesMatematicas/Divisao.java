public class Divisao {
public String divisao(int numerador1, int denominador1, int numerador2, int denominador2){
        int numerador = 0;
        int denominador = 0;

        numerador = (numerador1*denominador2);
        denominador = (denominador1*numerador2);

        while (numerador % 2 == 0 && denominador % 2 == 0) {
            numerador=numerador/2;
            denominador=denominador/2;
        }

        return numerador + "/" + denominador;
    }

    public static void main(String[] args) {
        Divisao primeirDivisao = new Divisao();
        String resultado = primeirDivisao.divisao(2, 8, 5, 6);

        System.out.println(resultado);
        }
}
