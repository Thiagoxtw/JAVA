import java.util.Scanner;

public class ControleDePesca {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, insira o peso em quilos de peixe que trouxe:");
        double peso = scanner.nextDouble();

        double limite = 50.0;

        if (peso <= limite) {
            System.out.println("O peso está dentro do limite. Não precisa pagar multa.");
        } else {
            double excesso = peso - limite;
            double multa = excesso * 4.0;

            System.out.printf("O peso excedeu o limite de %.2f kg.%n", limite);
            System.out.printf("Você excedeu em %.2f kg e deve pagar uma multa de R$ %.2f.%n", excesso, multa);
        }

        scanner.close();
    }
}

