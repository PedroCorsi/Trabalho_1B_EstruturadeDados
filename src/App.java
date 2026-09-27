import java.util.Scanner;

public class App {
    Scanner teclado = new Scanner(System.in);

    public int menu() {
        int opcao = 0;

        while (opcao < 1 || opcao > 5) {

            System.out.println("======================>MENU<======================");
            System.out.println("1 - Cadastrar Alunos");
            System.out.println("2 - Relatório por Nome (Crescente)");
            System.out.println("3 - Relatório por RA (Decrescente)");
            System.out.println("4 - Relatório de Aprovados (Crescente por Nome)");
            System.out.println("5 - Sair do sistema");
            System.out.println("======================>MENU<======================");
            System.out.print("Digite a opção desejada: ");
            opcao = teclado.nextInt(); 

            System.out.println("\n==============>" + "OPÇÃO " + opcao + " SELECIONADA" + "<===============\n");

            if (opcao > 5 || opcao <= 0) {
                System.out.println("Número inválido, digite novamente!");
            }
        }
        return opcao;
    }

    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        App app = new App();
        Captura captura = new Captura();
        RelatorioNome nomesOrd = new RelatorioNome();
        int opcaoEscolhida;

        do {
            opcaoEscolhida = app.menu();

            switch (opcaoEscolhida) {
                case 1:
                    captura.Cadastrar();
                    break;

                case 2:
                    nomesOrd.exibirCrescente(captura.getAluno());
                    break;

                case 3:
                    nomesOrd.exibirDecrescente(captura.getAluno());
                    break;

                case 4:
                   nomesOrd.relatorioAprovados(captura.getAluno());
                    break;

                case 5:
                    System.out.println("ENCERRANDO SISTEMA!......");
                    break;
            }

        } while (opcaoEscolhida != 5);
        teclado.close();
    }
}