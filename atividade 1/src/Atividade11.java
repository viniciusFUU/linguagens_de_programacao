import java.util.Scanner;

public class Atividade11 {
    public String podeVotar(int anoNascimento, int atual){
        int idade = atual - anoNascimento;

        if (idade >= 18){
            return "Pode votar";
        } else {
            return "Não pode votar";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite teu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();
        System.out.println("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        Atividade11 atividade11 = new Atividade11();

        System.out.println(atividade11.podeVotar(anoNascimento, anoAtual));
        scanner.close();
    }
}
