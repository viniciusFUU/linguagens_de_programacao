public class AtividadeDois {
    static double media(double p1, double e1, double e2, double api, double x, double sub){
        double mediaPonderada = p1 * 0.6 + ((e1 + e2) / 2) * 0.4;
        double normalizado = Math.max(mediaPonderada - 5.9, 0) / (mediaPonderada - 5.9);
        return mediaPonderada * 0.5 + (normalizado * (api * 0.5)) + (mediaPonderada > 5.9 ? x : 0) + (mediaPonderada > 5.9 ? sub * 0.2 : 0);
    }
    
    public static void main(String[] args){
        double p1 = 10;
        double e1 = 2;
        double e2 = 2;
        double api = 10;
        double x = 0;
        double sub = 0;
        
        System.out.println(media(p1, e1, e2, api, x, sub));
    }
}
