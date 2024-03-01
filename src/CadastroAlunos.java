import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroAlunos {
    private List<Aluno> alunos;

    public CadastroAlunos() {
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();
        System.out.println("Digite a idade do aluno:");
        int idade = scanner.nextInt();

        Aluno aluno = new Aluno(nome, idade);
        alunos.add(aluno);
        System.out.println("Aluno cadastrado com sucesso!");
    }

    public void listarAlunos() {
        System.out.println("Lista de Alunos:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }


    }

