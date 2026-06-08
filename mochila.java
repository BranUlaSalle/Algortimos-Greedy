public class mochila {
    public static void main(String[] args) {
        double capacidad = 50; 
        String[] items = {"A", "B", "C"};
        double[] v = {60, 100, 120};
        double[] p = {10, 20, 30};
        
        //creo en heap tres espacios contiguos 
        int n = items.length;
        double[] valor = new double[n]; 

        //imprime string items y valores de valor osea 0 0 0
        System.out.println("valor por kilo");
        for (int i = 0; i < n; i++) {
            valor[i] = v[i] / p[i];
            System.out.println("Item " + items[i] + " vale " + valor[i] + " por cada kilo.");
        }
    }
}
