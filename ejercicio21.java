package Practico6;

import java.util.Scanner;

public class ejercicio21 {

    public static void main(String args[]) {
        int[] numerosUsuario=pideNumeros();
        cuentaNumeros(numerosUsuario);
    }


    /* Contar el número de elementos positivos, negativos y ceros en un array de 5 enteros.
    Los numeros deben ser ingresados por el usuario. Luego, mostrar la cantidad de números
    positivos, negativos y ceros: */

    public static void cuentaNumeros(int[] unArray) {
        int positivos = 0;
        int negativos = 0;
        int cero = 0;
        for (int i = 0; i < unArray.length; i++) {
            if (unArray[i] < 0) {
                negativos++;
            } else if (unArray[i] > 0) {
                positivos++;
            } else {
                cero++;
            }
        }
        System.out.println("Se ingresaron " + positivos + " números positivos, " + negativos + " números negativos y " + cero + " ceros.");

    }

    public static int[] pideNumeros() {
        int[] numeros = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("**Bienvenido**");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese " + (i+1) + "° numero:");
            numeros[i] = input.nextInt();
            input.nextLine();
        }
        return numeros;
    }

}
