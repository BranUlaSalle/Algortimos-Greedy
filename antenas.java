public class antenas {
    public static void main(String[] args) {
        int[] casas = {1, 2, 7, 11, 20, 21, 30};
        int R = 5; 
        
        int n = casas.length; // n = 7
        int cont = 0;
        int i = 0;

        
        while (i < n) {

            int casaActual = casas[i];
            int dondePoner = casaActual + R;
            cont++;
            // hasta donde cubre
            int limite = dondePoner + R;

            //casas que se benefician 
            System.out.print("beneficiadas: ");
            while (i < n && casas[i] <= limite) {
                System.out.print(casas[i] + " ");
                i++; // saltamos a la siguiente casa ya cubierta
            }
            System.out.println();
        }
        System.out.println("antenas utilizadas: " + cont); 

    }
}
