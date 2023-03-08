
package Punto_2;

import java.util.Scanner;


public class punto_2 {

    
    
    
    public static void main(String[] args) {
   
    Cadenas cadena = new Cadenas();    
    Scanner sc = new Scanner(System.in);
        String input;
        int option;

        do {
            System.out.println("\nSelecciona una opción:");
            System.out.println("1. Sustituir vocales por el carácter que más se repite");
            System.out.println("2. Invertir el orden de las letras de atrás hacia adelante");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            option = sc.nextInt();
            sc.nextLine(); // consume el salto de línea después de la opción

            switch (option) {
                case 1: {
                    System.out.print("Ingresa una línea de caracteres: ");
                    input = sc.nextLine();
                    System.out.println("Resultado: " + cadena.sustituirVocales(input));
                }
                case 2: {
                    System.out.print("Ingresa una línea de caracteres: ");
                    input = sc.nextLine();
                    System.out.println("Resultado: " + cadena.invertirCadena(input));
                }
                case 3: System.out.println("¡Adiós!");
                default: System.out.println("Opción inválida");
            }
        } while (option != 3);
    }

   
    
}
