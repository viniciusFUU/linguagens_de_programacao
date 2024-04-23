public class Subtracao {
    public String subtracao(int numerador1, int denominador1, int numerador2, int denominador2){
        int numerador = 0;
        int denominador = 0;
        if(denominador1 == denominador2){
            denominador = denominador1;
            numerador = (denominador1 / denominador1 * numerador1)-(denominador1/denominador2*numerador2);
        } if (denominador1 % 2 == 0 && denominador2 % 2 == 0) {
            if (denominador1 > denominador2){
                denominador = denominador1;
                numerador = (denominador/denominador1*numerador1)-(denominador/denominador2*numerador2);
            } else {
                denominador = denominador2;
                numerador = (denominador/denominador1*numerador1)-(denominador/denominador2*numerador2);
            }
        } else {
            denominador = denominador1 * denominador2;
            numerador = (denominador/denominador1*numerador1)-(denominador/denominador2*numerador2);
        }

        while (numerador % 2 == 0 && denominador % 2 == 0) {
            numerador=numerador/2;
            denominador=denominador/2;
        }
        
        return numerador + "/" + denominador;
    }

    public static void main(String[] args) {
        Subtracao primeiSubtracao = new Subtracao();
        String resultado = primeiSubtracao.subtracao(4, 3, 2, 7);

        System.out.println(resultado);
    }
}
