
package Punto_1;

//libreria para arreglos 
import java.util.Arrays;

public class Estadistica {
 
private  final int[] arreglo;

    public Estadistica(int[] arreglo) {
        this.arreglo = arreglo;
    }

    public double media() {
        double suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        return suma / arreglo.length;
    }

    public double mediana() {
        int[] copia = Arrays.copyOf(arreglo, arreglo.length);
        Arrays.sort(copia);
        int n = copia.length;
        if (n % 2 == 0) {
            return (copia[n / 2 - 1] + copia[n / 2]) / 2.0;
        } else {
            return copia[n / 2];
        }
    }

    public double varianza() {
        double media = media();
        double suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += Math.pow(arreglo[i] - media, 2);
        }
        return suma / arreglo.length;
    }

    public double DesviacionEstandar() {
        double varianza = varianza();
        return Math.sqrt(varianza);
    }

    public int Moda() {
        int moda = 0;
        int repeticion = 0;
        int co = 0;
        for (int i = 0; i < arreglo.length; i++) {
            

            for (int j = 0; j < arreglo.length; j++) {
                if (arreglo[j] == arreglo[i]) {
                    co++;
                }
            }

            if (co > repeticion) {
                repeticion = co;
                moda = arreglo[i];
            }
        }

            if (repeticion == 1) {
                 System.out.println("La moda no existe, no hay números repetidos");
             } else {
                 System.out.println("La moda del arreglo es: " + moda);
             }
             return moda;
    }    
    
    
    
    
}
