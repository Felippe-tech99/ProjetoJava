import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int numeroDeAvaliacoes = 0;

        while (true) {
            System.out.println("Diga sua avaliação do filme ou -1 para encerrar: ");
            nota = leitura.nextDouble();

            if (nota == -1) {
                break;
            }

            mediaAvaliacao += nota;
            numeroDeAvaliacoes++;

            double media = mediaAvaliacao / numeroDeAvaliacoes;
            System.out.println("Média de avaliações: " + media);
        }

        leitura.close();
        System.out.println("Programa encerrado.");
    }
}