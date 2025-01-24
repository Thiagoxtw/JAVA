import java.util.Scanner;

public class VelocidadeLimite {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("TABELA DE MULTAS POR ESTAR ACIMA DA VELOCIDADE");
        System.out.println("Digite 1 se estiver acima dos 10Km/h, TOTAL DA MULTA: R$ 50,00");
        System.out.println("Digite 2 se estiver entre 11Km/h e 30Km/h, TOTAL DA MULTA: R$ 100,00");
        System.out.println("Digite 3 se estiver acima dos 31Km/h, TOTAL DA MULTA: R$ 300,00");

        System.out.println("Insira a velocidade do seu veículo:");
        double velocidade = scanner.nextDouble();

        System.out.println("Selecione a opção correspondente à sua velocidade:");
        System.out.println("1 - Acima de 10Km/h");
        System.out.println("2 - Entre 11Km/h e 30Km/h");
        System.out.println("3 - Acima de 31Km/h");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                if (velocidade > 10 && velocidade <= 30) {
                    System.out.println("A velocidade do seu veículo ultrapassou os 10Km/h. Sua multa será de R$ 50,00.");
                } else {
                    System.out.println("Você não se enquadra nesta categoria.");
                }
                break;

            case 2:
                if (velocidade > 11 && velocidade <= 30) {
                    System.out.println("A velocidade do seu veículo está entre 11Km/h e 30Km/h. Sua multa será de R$ 100,00.");
                } else {
                    System.out.println("Você não se enquadra nesta categoria.");
                }
                break;

            case 3:
                if (velocidade > 31) {
                    System.out.println("A velocidade do seu veículo ultrapassou os 31Km/h. Sua multa será de R$ 300,00.");
                } else {
                    System.out.println("Você não se enquadra nesta categoria.");
                }
                break;

            default:
                System.out.println("Opção inválida. Por favor, escolha entre 1, 2 ou 3.");
                break;
        }

        scanner.close();
    }
}
