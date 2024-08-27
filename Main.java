import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CadastroEscolar cadastroEscolar = new CadastroEscolar();
        Scanner scanner = new Scanner(System.in);

        boolean executando = true;

        while (executando) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Consultar Alunos");
            System.out.println("3 - Atualizar Aluno");
            System.out.println("4 - Excluir Aluno");
            System.out.println("5 - Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarAluno(scanner, cadastroEscolar);
                    break;
                case 2:
                    consultarAlunos(cadastroEscolar);
                    break;
                case 3:
                    atualizarAluno(scanner, cadastroEscolar);
                    break;
                case 4:
                    excluirAluno(scanner, cadastroEscolar);
                    break;
                case 5:
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void cadastrarAluno(Scanner scanner, CadastroEscolar cadastroEscolar) {
        // Implementar lógica de cadastro
    }

    private static void consultarAlunos(CadastroEscolar cadastroEscolar) {
        // Implementar lógica de consulta
    }

    private static void atualizarAluno(Scanner scanner, CadastroEscolar cadastroEscolar) {
        // Implementar lógica de atualização
    }

    private static void excluirAluno(Scanner scanner, CadastroEscolar cadastroEscolar) {
        // Implementar lógica de exclusão
    }
}