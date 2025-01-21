public class CreateJuice {
    // Método para criar suco
    public void createJuice(String ingredientes) {
        System.out.println("Colocar as frutas no liquidificador: " + ingredientes);
        System.out.println("Adicionar leite ou água ao liquidificador.");
        System.out.println("Ligar e bater o liquidificador com as frutas.");
        System.out.println("Sua bebida está pronta!");
    }

    // Método principal para execução do programa
    public static void main(String[] args) {
        // Criando um objeto da classe CreateJuice
        CreateJuice suco = new CreateJuice();

        // Chamando o método com um exemplo de ingredientes
        suco.createJuice("morango, banana e maçã");
    }
}
