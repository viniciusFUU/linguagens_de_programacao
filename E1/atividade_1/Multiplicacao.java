import java.util.Scanner;

public class Multiplicacao {
    public String multiplicacao(int numerador1, int denominador1, int numerador2, int denominador2){
        int numerador = numerador1*numerador2;
        int denominador = denominador1*denominador2;

        while (numerador % 2 == 0 && denominador % 2 == 0) {
            numerador=numerador/2;
            denominador=denominador/2;
        }

        return numerador1 + "/" + denominador1 + " x " + numerador2 + "/" + denominador2 + " = " + numerador + "/" + denominador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numerador da primeira fração: ");
        int primeiro = scanner.nextInt();
        System.out.println("Digite o denominador da primeira fração: ");
        int segundo = scanner.nextInt();
        System.out.println("Digite o numerador da segunda fração: ");
        int terceiro = scanner.nextInt();
        System.out.println("Digite o denominador da segunda fração: ");
        int quarto = scanner.nextInt();
        scanner.close();
        Multiplicacao primeirMultiplicacao = new Multiplicacao();        
        String resultado = primeirMultiplicacao.multiplicacao(primeiro, segundo, terceiro, quarto);

        System.out.println(resultado);
    }
}
