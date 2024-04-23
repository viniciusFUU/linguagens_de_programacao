import java.util.Scanner;

public class Atividade9 {
    double maca = 1.3;

    public String qtdCompras(int qtdMacas){
        if (qtdMacas > 12){
            maca = 1.0;
            return "Você comprou " + qtdMacas + " e o valor da sua compra é de: " + (qtdMacas * maca);
        } else {
            return "Você comprou " + qtdMacas + " e o valor da sua compra é de: " + (qtdMacas * maca);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantas macas comprou? ");
        int qtdCompras = scanner.nextInt();
        Atividade9 atividade9 = new Atividade9();

        System.out.println(atividade9.qtdCompras(qtdCompras));
        scanner.close();
    }
}
