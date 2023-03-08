
package Punto_2;


public class Cadenas {
    
     public static String sustituirVocales(String input) {
        char[] chars = input.toCharArray();
        int[] count = new int[256];
        char maxChar = 0;
        int maxCount = 0;

        // Contar la frecuencia de cada caracter
        for (char c : chars) {
            if (esVocal(c)) {
                count[c]++;
                if (count[c] > maxCount) {
                    maxChar = c;
                    maxCount = count[c];
                }
            }
        }

        // Sustituir las vocales por el caracter más frecuente
        for (int i = 0; i < chars.length; i++) {
            if (esVocal(chars[i])) {
                chars[i] = maxChar;
            }
        }

        return new String(chars);
    }

    public static boolean esVocal(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }

    public static String invertirCadena(String input) {
        char[] chars = input.toCharArray();
        int i = 0;
        int j = chars.length - 1;

        while (i < j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }

        return new String(chars);    
        
        
    }
    
}
