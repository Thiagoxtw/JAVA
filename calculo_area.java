import java.util.Scanner;

public class calculo_area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o tamanho do lado do quadrado:");
        int lado = scanner.nextInt();

            
        int area = lado * lado;

      
        int areaDobrada = area * 2;

        System.out.println("A área do quadrado é igual a " + area);
        System.out.println("O dobro da área é igual a " + areaDobrada);

        scanner.close();
    }
}
