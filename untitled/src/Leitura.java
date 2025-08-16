import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filmeFavorito = leitura.nextLine();
        System.out.println("Diigite o ano de lançamento: ");
        int anoLancmaneto = leitura.nextInt();
        System.out.println(anoLancmaneto);
        System.out.println("Digite sua avaliação: ");
        double avaliacao = leitura.nextDouble();

        System.out.println(filmeFavorito);
        System.out.println(anoLancmaneto);
        System.out.println(avaliacao);

    }
}
