import java.util.Scanner;

public class Atividade6 {
    static String fahrenheit(double temperatura){
        double celsius = (temperatura - 32) * 5 / 9;

        return "A temperatura de " + temperatura + " Fahrenheit para Celsius é: " + celsius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit: ");
        Double temperatura = scanner.nextDouble();
        System.out.println(fahrenheit(temperatura));
        scanner.close();
    }
}
