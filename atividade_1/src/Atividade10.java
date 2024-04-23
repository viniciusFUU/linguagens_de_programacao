import java.util.Scanner;

public class Atividade10 {
    public String nota(double um, double dois){
        double media = (um + dois) / 2;

        if (media >= 6 && media <= 10) {
            return "Sua média foi: " + media + ". Parabéns! Aprovado";
        } else if (media < 6 && media >= 0) {
            return "Sua média foi: " + media + ". Reprovado";
        } else {
            return "Nota inválida";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double um, dois;
        boolean notasValidas = false;

        do {
            System.err.println("Digite a 1ª nota (entre 0 e 10): ");
            um = scanner.nextDouble();

            System.err.println("Digite a 2ª nota (entre 0 e 10): ");
            dois = scanner.nextDouble();

            if (um >= 0 && um <= 10 && dois >= 0 && dois <= 10) {
                notasValidas = true;
            } else {
                System.err.println("Notas inválidas. Por favor, insira notas entre 0 e 10.");
            }
        } while (!notasValidas);

        Atividade10 atividade10 = new Atividade10();
        System.out.println(atividade10.nota(um, dois));

        scanner.close();
    }
}
