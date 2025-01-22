import java.util.Scanner;

public class calculo_area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o tamanho do lado do quadrado:");
        int lado = scanner.nextInt();

        // Calcula a área do quadrado
        int area = lado * lado;

        // Calcula o dobro da área
        int areaDobrada = area * 2;

        // Exibe o resultado da área e a área dobrada
        System.out.println("A área do quadrado é igual a " + area);
        System.out.println("O dobro da área é igual a " + areaDobrada);

        scanner.close();
    }
}
