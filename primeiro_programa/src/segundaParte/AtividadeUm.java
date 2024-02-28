public class AtividadeUm.java {
    public static void main(String[] args){
        int janeiro, fevereiro, marco;
        double gastosPrimeiroTrimestre, mediaDeGastoTrimestre;
        
        janeiro = 15000;
        fevereiro = 23000;
        marco = 17000;
        
        gastosPrimeiroTrimestre = (janeiro+fevereiro+marco);
        mediaDeGastoTrimestre = (janeiro+fevereiro+marco)/3;
        
        System.out.println("O gasto total do trimestre foi de: "+gastosPrimeiroTrimestre);
        System.out.println("Quanto a média de gastos por trimestre é: "+mediaDeGastoTrimestre);
    }
}