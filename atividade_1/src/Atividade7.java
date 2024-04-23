import java.util.Scanner;

public class Atividade7 {
    static String verificacao(int n){
        if (n <= 10){
            return n + " não é maior que 10!";
        } else {
            return n + " é maior que 10!";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int valor = scanner.nextInt();

        System.out.println(verificacao(valor));
        scanner.close();
    }
}
