import java.util.ArrayList;
import java.util.Scanner;

class Aluno {
    private String nome;
    private int idade;
    private double notaFinal;

    public Aluno(String nome, int idade, double notaFinal) {
        this.nome = nome;
        this.idade = idade;
        this.notaFinal = notaFinal;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Nota Final: " + notaFinal;
    }
}

public class SistemaCadastroAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();

        while (true) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Cadastrar aluno");
            System.out.println("2. Listar alunos");
            System.out.println("3. Exibir a média de notas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer do scanner

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do aluno: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite a idade do aluno: ");
                    int idade = scanner.nextInt();

                    System.out.print("Digite a nota final do aluno (0 a 10): ");
                    double notaFinal = scanner.nextDouble();

                    if (nome.isEmpty() || notaFinal < 0 || notaFinal > 10) {
                        System.out.println("Erro: Nome inválido ou nota fora do intervalo 0 a 10.");
                    } else {
                        alunos.add(new Aluno(nome, idade, notaFinal));
                        System.out.println("Aluno cadastrado com sucesso!");
                    }
                    break;

                case 2:
                    if (alunos.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado.");
                    } else {
                        System.out.println("\nLista de Alunos:");
                        for (Aluno aluno : alunos) {
                            System.out.println(aluno);
                        }
                    }
                    break;

                case 3:
                    if (alunos.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado para calcular a média.");
                    } else {
                        double somaNotas = 0;
                        for (Aluno aluno : alunos) {
                            somaNotas += aluno.getNotaFinal();
                        }
                        double media = somaNotas / alunos.size();
                        System.out.printf("A média de notas dos alunos é: %.2f\n", media);
                    }
                    break;

                case 4:
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}

