import java.util.Scanner;

public  class IdadeEmDias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ano = 365; 
        int mes = 30;  
        int total;

        System.out.print("Insira sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Insira o número do mês em que nasceu (1 a 12): ");
        int mesNascimento = scanner.nextInt();

       
        total = idade * ano + (mesNascimento * mes);

        
        System.out.println("Sua idade em dias é aproximadamente: " + total + " dias.");
    }
}

