import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULADORA DE PESO IDEAL");
        System.out.println("Digite 1 se for homem");
        System.out.println("Digite 2 se for mulher");
        System.out.println("Escolha seu gênero:");

        int escolha = scanner.nextInt();
        double pesoIdeal;

        switch (escolha) {
            case 1: 
                System.out.println("Insira sua altura em metros (por exemplo, 1.75):");
                double alturaHomem = scanner.nextDouble();
                pesoIdeal = (72.7 * alturaHomem) - 58;
                System.out.printf("Seu peso ideal é: %.2f kg%n", pesoIdeal);
                break;

            case 2: 
                System.out.println("Insira sua altura em metros (por exemplo, 1.65):");
                double alturaMulher = scanner.nextDouble();
                pesoIdeal = (62.1 * alturaMulher) - 44.7;
                System.out.printf("Seu peso ideal é: %.2f kg%n", pesoIdeal);
                break;

            default: 
                System.out.println("Opção inválida! Por favor, reinicie o programa e escolha 1 ou 2.");
                break;
        }

        
        scanner.close();
    }
}
