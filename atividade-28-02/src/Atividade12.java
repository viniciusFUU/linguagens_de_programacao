import java.util.Scanner;

public class Atividade12 {
    public String maiorEntreDois(int um, int dois){
        return Math.max(um, dois) + " é o maior";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int um = scanner.nextInt();

        System.out.println("Digito o segundo número: ");
        int dois = scanner.nextInt();

        Atividade12 atividade12 = new Atividade12();

        System.out.println(atividade12.maiorEntreDois(um, dois));

        scanner.close();
    }
}
