import java.util.Scanner;

public class Atividade10 {
    public String nota(int um, int dois){
        double media = (um + dois) / 2;

        if (media >= 6 && media <= 10) {
            return "Sua media foi: "+media+". Parabéns! Aprovado";
        } else if (media < 6 && media >= 0) {
            return "Sua media foi: "+media+" Reprovado";
        } else {
            return "Nota inválida";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int um, dois;
        boolean notasValidas = false;

        do {
            System.err.println("Digite a 1º nota (entre 0 e 10): ");
            um = scanner.nextInt();

            System.err.println("Digite a 2º nota (entre 0 e 10): ");
            dois = scanner.nextInt();

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
