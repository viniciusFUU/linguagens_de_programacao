import java.util.Scanner;

public class Atividade2 {
    int lula = 0, bolsonaro = 0, branco = 0, nulos = 0, qtdVotos = 0;

    public void eleicao(int voto){

        if (voto == 1){
            lula++;
            qtdVotos++;
        } else if (voto == 2){
            bolsonaro++;
            qtdVotos++;
        } else if (voto == 0){
            branco++;
            qtdVotos++;
        } else if (voto == 3){
            nulos++;
            qtdVotos++;
        }

        return ;
    }
    
    public String resultados(){
        return "Lula obteve " + lula + " votos, Bolsonaro obteve " + bolsonaro + " votos, Branco obteve " + branco + " votos e Nulo obteve " + nulos + " votos. A quantidade de votos foi de " + qtdVotos;
    }

    public static void main(String[] args) {
        boolean votacao = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Segundo turno eleições Brasileiras");
        System.out.println("Lula: 1, Bolsonaro: 2, Branco: 0, Nulo: 3, Sair: 4");
        Atividade2 atividade2 = new Atividade2();

        while (votacao == true){
            System.out.println("Digite seu voto: ");
            int votos = scanner.nextInt();       
            atividade2.eleicao(votos);        

            if (votos == 4){
                votacao = false;
            }
        }
        scanner.close();

        System.out.println(atividade2.resultados());
        
        if (atividade2.lula > atividade2.bolsonaro){
            System.out.println("Lula venceu");
        } else if (atividade2.bolsonaro > atividade2.lula){
            System.out.println("Bolsonaro venceu");
        } else {
            System.out.println("Empate");
        }
    }
}