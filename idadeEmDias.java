import java.util.Scanner;

public class idadeEmDias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int DIAS_ANO = 365;
        final int DIAS_MES = 30;

        System.out.print("Insira sua idade em anos: ");
        int idade = scanner.nextInt();

        System.out.print("Insira o número do mês em que nasceu (1 a 12): ");
        int mesNascimento = scanner.nextInt();

        int totalDias = (idade * DIAS_ANO) + ((12 - mesNascimento) * DIAS_MES);

        System.out.println("Sua idade em dias é aproximadamente: " + totalDias + " dias.");

        scanner.close();
    }
}
