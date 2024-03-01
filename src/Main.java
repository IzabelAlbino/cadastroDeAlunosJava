import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CadastroAlunos cadastro = new CadastroAlunos();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("-----------------------");
            System.out.println("1 - Adicionar Aluno");
            System.out.println("2 - Listar Alunos");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção:");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastro.adicionarAluno();
                    break;
                case 2:
                    cadastro.listarAlunos();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}
