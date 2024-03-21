public class Soma{
    public int soma(int a, int b){
        return a + b;
    }

    public static void main(String[] args){
        Soma primeiraSoma = new Soma();
        int resultado = primeiraSoma.soma(1, 3);

        System.out.println(resultado);
    }
}