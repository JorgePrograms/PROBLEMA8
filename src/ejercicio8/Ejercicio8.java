package ejercicio8;

import java.util.Scanner;


public class Ejercicio8 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del array: ");
        int n = scanner.nextInt();

     
        int[] array = new int[n];

       
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor para la posición " + i + ": ");
            array[i] = scanner.nextInt();
        }

        
        System.out.print("Array ingresado: {");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

       
        int maxValor = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] > maxValor) {
                maxValor = array[i];
            }
        }

      
        System.out.println("El valor más grande en el array es: " + maxValor);
    
}
}