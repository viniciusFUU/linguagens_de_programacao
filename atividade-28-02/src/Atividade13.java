import java.util.Scanner;

public class Atividade13 {
    public String maiorMenor(int primeiro, int segundo){
        if (primeiro > segundo){
            return "O numero " + primeiro + " é maior que o " + segundo;
        } else if (segundo > primeiro) {
            return "O numero " + segundo + " é maior que o " + primeiro;
        } else{
            return "Números iguais.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int primeiro = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int segundo =scanner.nextInt();

        Atividade13 atividade13 = new Atividade13();

        System.out.print(atividade13.maiorMenor(primeiro, segundo));

        scanner.close();
    }
}
