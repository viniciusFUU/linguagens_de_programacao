import java.util.Scanner;

public class Atividade5 {
    double valorTotalVendas = 0;

    public String salarioVendedor(double salario, int qtdVendas){
        double comissao = 0.05;
        int contador = 1;
        
        Scanner scanner = new Scanner(System.in);
        
        while (contador != qtdVendas+1) {
            System.out.print("Digite o valor da " + contador + "ª venda: ");
            double valorVenda = scanner.nextDouble();
            valorTotalVendas += valorVenda;
            contador+=1;
            
        }
        
        scanner.close();
        
        double salarioFinal = salario + (valorTotalVendas * comissao);
        
        return "Este é o novo valor do salário: "+  salarioFinal;
    }

    public static void main(String[] args) {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Digite seu salário: ");
        double salario = scanner2.nextDouble();
        System.out.println("Digite a quantidade de vendas: ");
        int qtdVendas = scanner2.nextInt();

        Atividade5 atividade5 = new Atividade5();

        System.out.println(atividade5.salarioVendedor(salario, qtdVendas));
        scanner2.close();
    }
}
