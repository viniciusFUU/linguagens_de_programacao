import java.util.Scanner;

public class Atividade4 {

    static String carro(double valor){
        double valorFinal, porcentagemDistribuidor = 0.28, impostos = 0.45;
        valorFinal = valor + (valor * porcentagemDistribuidor) + (valor * impostos);
        
        return "O valor total do carro é de: R$" +valorFinal;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do carro: ");
        double valor = scanner.nextDouble();

        System.out.println(carro(valor));

        scanner.close();
    }


}
