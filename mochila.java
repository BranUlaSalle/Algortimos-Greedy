public class mochila {
    public static void main(String[] args) {
        double capacidad = 50; 
        String[] items = {"A", "B", "C"};
        double[] v = {60, 100, 120};
        double[] p = {10, 20, 30};
        
        //creo en heap tres espacios contiguos 
        int n = items.length;
        double[] valor = new double[n]; 

        //valor 0 es 6, valor 1 es 5 y valor 2  es 40
        for (int i = 0; i < n; i++) {
            valor[i] = v[i] / p[i];
        }

        //ordenamos los datos de mayor a menor 
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                //el if solo se cumple cuando el valor[i] sea menor al siguiente dato
                if (valor[i] < valor[j]) {
                    //cambio valores de heap 
                    double temp1 = valor[i]; valor[i] = valor[j]; valor[j] = temp1;
                    // cambio las letras
                    String temp2 = items[i]; items[i] = items[j]; items[j] = temp2;
                    // cambio valor de v y p
                    double temp3 = v[i]; v[i] = v[j]; v[j] = temp3;
                    double temp4 = p[i]; p[i] = p[j]; p[j] = temp4;
                }
            }
        }

        System.out.println("Objetos seleccionados:");
        
        double total = 0;


        for (int i = 0; i < n; i++) {
            System.out.println("capacidad: " + capacidad);
            //si la mochilla esta llena entonces salgo del for
            if (capacidad <= 0) break;
            // como el ultimo es 30 solo quedara dsiponible 20 de capacidad pasa a fraccionarse
            if (p[i] <= capacidad) {
                total += v[i];
                capacidad -= p[i];
                System.out.println(items + "completo");
            } else {
                double parte = capacidad / p[i];
                total += v[i] * parte;
                boolean lleno=true;
                if(lleno == true) capacidad = 0;
                System.out.println("Parte del objeto " + items);
            }
        }

        System.out.println("Valor total aproxiamdo: " + total);
    }
        
}
