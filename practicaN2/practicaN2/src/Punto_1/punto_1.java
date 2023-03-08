
package Punto_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;




public class punto_1 {

    
    
    
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = input.nextInt();

        int[] arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            arreglo[i] = rand.nextInt(100);
        }

        System.out.println("El arreglo generado es: " + Arrays.toString(arreglo));

        Estadistica estadistica = new Estadistica(arreglo);

        int opcion = 0;
        while (opcion != 6) {
            System.out.println("\n\tBIENVENIDO");
            System.out.println("Seleccione la operación a realizar:");
            System.out.println("1. Media");
            System.out.println("2. Mediana");
            System.out.println("3. Varianza");
            System.out.println("4. Desviación estándar");
            System.out.println("5. Moda");
            System.out.println("6. Salir");
            System.out.print("Elige una opcion: ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    double media = estadistica.media();
                    System.out.println("La media del arreglo es: " + media);
                    break;
                case 2:
                    double mediana = estadistica.mediana();
                    System.out.println("La mediana del arreglo es: " + mediana);
                    break;
                case 3:
                    double varianza = estadistica.varianza();
                    System.out.println("La varianza del arreglo es: " + varianza);
                    break;
                case 4:
                    double desviacion = estadistica.DesviacionEstandar();
                    System.out.println("La desviación estándar: " + desviacion);
                    break;
                case 5:
                    int moda = estadistica.Moda();
                    break;
                case 6:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Intente de nuevo.");
            }
        }

        input.close();    
        
        
    }
    
}
