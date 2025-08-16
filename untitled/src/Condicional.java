public class Condicional {
    public static void main(String[] args) {
        int anoLancamento = 2022;
        boolean incluidoNoPlano = false;
        double classificacao = 8.1;
        String tipoPlano ="normal";

        if (anoLancamento >= 2022){
            System.out.println("Lnaçamento que os clientes estão curtindo!!!!!");
        } else {
            System.out.println("Filme retrô que vale assistir!!!!");
        }
        if (incluidoNoPlano == true || tipoPlano.equals("plus")){
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve alugar");
        }
    }
}
