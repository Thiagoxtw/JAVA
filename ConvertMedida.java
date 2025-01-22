import java.util.Scanner;

public class ConvertMedida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de conversão:");
        System.out.println("1. Quilômetro para Metro");
        System.out.println("2. Metro para Centímetro");
        System.out.println("3. Metro para Hectômetro");
        int escolha = scanner.nextInt();

        System.out.println("Digite o valor para converter:");
        double valor = scanner.nextDouble(); // Valor a ser convertido

        switch (escolha) {
            case 1:
                System.out.println("Quilômetro para Metro:");
                double resultadoKmParaM = valor * 1000;
                System.out.println(valor + " km equivalem a " + resultadoKmParaM + " metros.");
                break;

            case 2:
                System.out.println("Metro para Centímetro:");
                double resultadoMParaCm = valor * 100;
                System.out.println(valor + " metros equivalem a " + resultadoMParaCm + " centímetros.");
                break;

            case 3:
                System.out.println("Metro para Hectômetro:");
                double resultadoMParaHm = valor / 100;
                System.out.println(valor + " metros equivalem a " + resultadoMParaHm + " hectômetros.");
                break;

            default:
                System.out.println("Opção inválida! Por favor, escolha uma opção entre 1 e 3.");
                break;
        }

        scanner.close();
    }
}
