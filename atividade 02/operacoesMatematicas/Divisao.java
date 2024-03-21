public class Divisao {
    public Object divisao(int a, int b){
        if(a >= b){
            return (double) a / b;
        } else {
            return "Impossivel executar o calculo";
        }
    }

    public static void main(String[] args) {
        Divisao primeirDivisao = new Divisao();
        Object resultado = primeirDivisao.divisao(11, 2);

        System.out.println(resultado);
        }
}
