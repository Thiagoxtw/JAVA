import java.util.Scanner;

public class OperacoesMistas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira seu primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.println("Insira seu segundo número inteiro: ");
        int num2 = scanner.nextInt();

        System.out.println("Insira um número real: ");
        double numR = scanner.nextDouble();

        
        int produtoDobroMetade = (num1 * 2) * (num2 / 2);

        
        double somaTriploComReal = (num1 * 3) + numR;

        
        double numRealCubo = Math.pow(numR, 3);

        
        System.out.println("O produto do dobro do primeiro com metade do segundo é: " + produtoDobroMetade);
        System.out.println("A soma do triplo do primeiro com o número real é: " + somaTriploComReal);
        System.out.println("O número real elevado ao cubo é: " + numRealCubo);

        scanner.close();
    }
}
