//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome = "Roni Paixão";
        String tipoDeConta = "Poupança";
        double saldo = 3000;

        System.out.println("*****************************");
        System.out.println("\nDados iniciais do cliente:");
        System.out.println("\nNome: " + nome);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("\n*****************************");

        String menuOpcoes = """
                Operações
                                
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                """;
        Scanner leitura = new Scanner(System.in);
        int menuEscolha = 0;
        String mensagemSaldo = "Saldo atual: R$";

        while (menuEscolha != 4) {
            System.out.println(menuOpcoes);
            menuEscolha = leitura.nextInt();

            if (menuEscolha == 1) {
                System.out.println(mensagemSaldo + saldo);
            } else {
                if (menuEscolha == 2) {
                    System.out.println("Quanto você quer depositar?");
                    double recebimentoValor = leitura.nextDouble();
                    saldo = saldo + recebimentoValor;
                    System.out.println(mensagemSaldo + saldo);
                } else {
                    if (menuEscolha == 3) {
                        System.out.println("Quanto você quer transferir?");
                        double transferirValor = leitura.nextDouble();
                        if (transferirValor > saldo) {
                            System.out.println("Você não tem saldo suficiente para esta transferência");
                        } else {
                            saldo = saldo - transferirValor;
                            System.out.println(mensagemSaldo + saldo);
                        }
                    } else {
                        if (menuEscolha > 4) {
                            System.out.println("Escolha inválida");
                        }
                    }
                }
            }
        }

        System.out.println("Fim da aplicação!");
    }
}
