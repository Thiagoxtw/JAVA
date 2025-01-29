public class DivisiveisPorCinco {
    public static void main(String[] args) {
        int num = 1000; 

        while (num <= 1999) { // Enquanto estiver dentro do intervalo
            if (num % 5 == 0) { 
                System.out.println(num);
            }
            num++;
        }
    }
}

