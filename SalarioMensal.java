import java.util.Scanner;

public class SalarioMensal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quanto você ganha por hora? R$: ");
        double ganhoPorHora = scanner.nextDouble(); 

        System.out.print("Quantas horas você trabalha no mês no total? ");
        int horasTrabalhadas = scanner.nextInt();  

        double salario = ganhoPorHora * horasTrabalhadas;  

        System.out.printf("Seu salário total é: R$ %.2f%n", salario);  

        scanner.close();
    }
}
