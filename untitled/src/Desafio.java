import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
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

        Scanner leituraDeDados = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leituraDeDados.nextInt();

            if (opcao == 1){
                System.out.println("O saldo atualizado é " + saldoConta);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir?");
                double valor = leituraDeDados.nextDouble();
                if (valor > saldoConta) {
                    System.out.println("Não há saldo para realizar a transferência.");
                } else {
                    saldoConta -= valor;
                    System.out.println("Novo saldo: " + saldoConta);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leituraDeDados.nextDouble();
                saldoConta += valor;
                System.out.println("Novo saldo: " + saldoConta);
            } else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }
        }
    }
}