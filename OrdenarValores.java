import java.util.Scanner;

public class OrdenarValores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira seu primeiro valor:");
        int valor1 = scanner.nextInt();

        System.out.println("Insira seu segundo valor:");
        int valor2 = scanner.nextInt();

        System.out.println("Insira seu terceiro valor:");
        int valor3 = scanner.nextInt();

        
        if (valor1 >= valor2 && valor1 >= valor3) {
            System.out.println("O valor 1 é maior que os outros dois elementos.");
        } else if (valor2 >= valor1 && valor2 >= valor3) {
            System.out.println("O valor 2 é maior que os outros dois elementos.");
        } else if (valor3 >= valor1 && valor3 >= valor2) {
            System.out.println("O valor 3 é maior que os outros dois elementos.");
        }

        
        int menor, medio, maior;

        if (valor1 <= valor2 && valor1 <= valor3) {
            menor = valor1;
            if (valor2 <= valor3) {
                medio = valor2;
                maior = valor3;
            } else {
                medio = valor3;
                maior = valor2;
            }
        } else if (valor2 <= valor1 && valor2 <= valor3) {
            menor = valor2;
            if (valor1 <= valor3) {
                medio = valor1;
                maior = valor3;
            } else {
                medio = valor3;
                maior = valor1;
            }
        } else {
            menor = valor3;
            if (valor1 <= valor2) {
                medio = valor1;
                maior = valor2;
            } else {
                medio = valor2;
                maior = valor1;
            }
        }

        System.out.println("A ordem crescente dos números é: " + menor + ", " + medio + ", " + maior);

        scanner.close();
    }
}
