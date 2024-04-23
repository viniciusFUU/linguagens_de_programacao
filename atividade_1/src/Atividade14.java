import java.util.Scanner;

public class Atividade14 {
    public String horasDeJogos(int inicio, int fim){
        int horasDeJogo;
        if (inicio > fim) {
            horasDeJogo = (24 - inicio) + fim;
        } else {
            horasDeJogo = fim - inicio;
        }

        return "O jogo teve "+horasDeJogo + " horas.";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a hora inteiro do início do game: ");
        int inicio = scanner.nextInt();

        System.out.print("Digite o horário do fim do game: ");
        int fim= scanner.nextInt();

        Atividade14 atividade14 = new Atividade14();

        System.out.println(atividade14.horasDeJogos(inicio, fim));

        scanner.close();
    }

}
