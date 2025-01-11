import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exibe o menu de operações
        System.out.println("=== Calculadora ===");
        System.out.println("Escolha uma operação:");
        System.out.println("1 - Adição (+)");
        System.out.println("2 - Subtração (-)");
        System.out.println("3 - Multiplicação (*)");
        System.out.println("4 - Divisão (/)");
        System.out.print("Digite a opção desejada: ");
        int opcao = scanner.nextInt();

        // Solicita os números ao usuário
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        // Realiza a operação escolhida
        double resultado = 0;
        boolean operacaoValida = true;

        switch (opcao) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado: " + num1 + " + " + num2 + " = " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado: " + num1 + " - " + num2 + " = " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado: " + num1 + " * " + num2 + " = " + resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + num1 + " / " + num2 + " = " + resultado);
                } else {
                    System.out.println("Erro: divisão por zero não é permitida!");
                }
                break;
            default:
                operacaoValida = false;
                System.out.println("Opção inválida! Tente novamente.");
                break;
        }

        // Finaliza o programa
        if (operacaoValida) {
            System.out.println("Operação concluída com sucesso.");
        }
        scanner.close();
    }
}

