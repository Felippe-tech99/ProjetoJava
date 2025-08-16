import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leituraDeDados = new Scanner(System.in);
        String nome = "Felippe";
        String tipoConta = "Corrente";
        double saldoConta = 2500;
        int opcao = 0;

        System.out.println("Bem Vindo ao Banco Master !!!!!");
        System.out.println("\nNome do cliente " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo em contato R$" + saldoConta);
        System.out.println("\n**********************************");

        String menu = """
                *** Digite uma da opções a seguir**
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;

        while (opcao != 4);
        System.out.println(menu);
        opcao = leituraDeDados.nextInt();

        if(opcao ==1);
        System.out.println("Saldo em conta:" + saldoConta);

        }

    }



