
package Punto_4;

import java.util.Scanner;

public class Consola {
 private String marca;
    private int kilometraje;
    private String color;
    private String modelo;

    public Consola(String marca, int kilometraje, String color, String modelo) {
        this.marca = marca;
        this.kilometraje = kilometraje;
        this.color = color;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public String getColor() {
        return color;
    }

    public String getModelo() {
        return modelo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de Carros: ");
        int numCoches = scanner.nextInt();
        scanner.nextLine();

        Consola[] coches = new Consola[numCoches];

        for (int i = 0; i < numCoches; i++) {
            System.out.println("Ingrese los datos del carro " + (i + 1) + ":");
            System.out.print("Marca: ");
            String marca = scanner.nextLine();
            System.out.print("Kilometraje: ");
            int kilometraje = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Color: ");
            String color = scanner.nextLine();
            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();

            coches[i] = new Consola(marca, kilometraje, color, modelo);
        }

        for (Consola coche : coches) {
            System.out.println("\nMarca: " + coche.getMarca());
            System.out.println("Kilometraje: " + coche.getKilometraje());
            System.out.println("Color: " + coche.getColor());
            System.out.println("Modelo: " + coche.getModelo());
        }
    }    
}
