import java.util.Scanner;

public class Atividade8 {
    public String positivoOuNegativo(int n){
        if (n > 0){
            return n +" é Positivo";
        } else {
            return n +" é Negativo";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para ser verificado: ");
        int num = scanner.nextInt();
        Atividade8 atividade8 = new Atividade8();

        System.out.println(atividade8.positivoOuNegativo(num));

        scanner.close();

    }
}
