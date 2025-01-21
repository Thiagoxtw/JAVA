import java.util.Scanner;

public class verificadorIdade{
    public static void main(String[] args) {
        // Cria um objeto Scanner para capturar entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome do usuário
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine(); // Lê o nome digitado

        // Solicita a idade do usuário
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt(); // Lê a idade digitada

        // Verifica se o usuário é maior ou menor de idade
        if (idade >= 18) {
            System.out.println(nome + ", você é maior de idade.");
        } else {
            System.out.println(nome + ", você ainda é menor de idade.");
        }

        // Fecha o Scanner para liberar recursos
        scanner.close();
    }
}
