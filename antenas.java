public class antenas {
    public static void main(String[] args) {
        int[] casas = {1, 2, 7, 11, 20, 21, 30};
        int cober = 5; 
        
        int n = casas.length; // n = 7
        int cont = 0;
        int i = 0;

        
        while (i < n) {
            int dondePoner = casas[i] + cober; 
            cont++;
            System.out.println("Antena " + cont + " " + dondePoner);
            
        }
    }
}
