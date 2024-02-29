import java.util.Scanner;

class Atividade1 {
    static String idade(int idade){
        int meses, dias;
        
        meses = idade*12;
        dias = idade*365;

        return "Voce tem " +idade+ " anos de idade, " +meses+" meses e "+dias+" dias";
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Qual sua idade? ");
        int idade = scanner.nextInt();
        
        scanner.close();
        
        System.out.println(idade(idade));
    }
}