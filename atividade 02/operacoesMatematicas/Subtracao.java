public class Subtracao {
    public int subtracao(int a, int b){
        return a - b;
    }

    public static void main(String[] args) {
        Subtracao primeiSubtracao = new Subtracao();
        int resultado = primeiSubtracao.subtracao(4, 2);

        System.out.println(resultado);
    }
}
