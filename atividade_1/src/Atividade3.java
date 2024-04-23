import java.util.Scanner;

public class Atividade3 {
    double salarioReajustado, reajuste = 0.07;
    
    public String novoSalario (double salario){
        salarioReajustado = salario + (salario * reajuste);

        return "Este é o novo valor do salário: "+  salarioReajustado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu salário: ");
        double salario = scanner.nextDouble();
        Atividade3 atividade3 = new Atividade3();

        scanner.close();

        System.out.println(atividade3.novoSalario(salario));
    }
}
