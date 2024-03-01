import java.util.Scanner;

public class Atividade15 {
    int jornadaTrabalhada = 40;
    int semanas = 4;
    int dias = 5;
    int horas = 8;
    
    public String calculoHorasExtra(int salario){
        int valorFinalSalario = salario;
        double valorHora = (((salario/semanas)/dias)/horas);
        int contador = 1;
        Scanner scanner = new Scanner(System.in);

        while (contador != 4+1) {
            System.out.println("Digite a quantidade de horas da " + contador + "ª semana:");
            int horasTrabalhadas = scanner.nextInt();
            
            if (horasTrabalhadas > 40){
                valorFinalSalario+=valorHora+(valorHora*0.5);
            }

            contador+=1;

        }
        scanner.close();

        return "Este é o valor do salario: " + valorFinalSalario;
    }

    public static void main(String[] args) {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Digite o valor do teu salário: ");
        int salario = scanner2.nextInt();

        Atividade15 atividade15 = new Atividade15();

        System.out.println(atividade15.calculoHorasExtra(salario));

        scanner2.close();
    }
}
