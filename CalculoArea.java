import java.util.Scanner;

public class CalculoArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira por favor a base do triângulo:");
        int base = scanner.nextInt();

        System.out.println("Insira por favor a altura do triângulo:");
        int altura = scanner.nextInt();

        // Calcula a área
        int area = (base * altura) / 2;

        System.out.println("A área do triângulo é: " + area);

        scanner.close(); // Fecha o scanner para evitar vazamentos de recursos
    }
}
