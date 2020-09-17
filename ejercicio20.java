package Practico6;

public class ejercicio20 {

    public static void main(String args[]) {

        boolean[] primerArray = new boolean[5];
        boolean[] segundoArray = new boolean[5];
        primerArray = convierteTrue(primerArray);
        segundoArray[4] = true;
        System.out.println(sonVerdaderos(primerArray));
        System.out.println(sonVerdaderos(segundoArray));

    }

    /*Crear un método que reciba un arreglo de booleanos y retorne true si y sólo si, todos los
    elementos son verdaderos.*/

    public static boolean sonVerdaderos(boolean[] unArray) {
        boolean retorno = false;
        int contador = 0;
        for (int i = 0; i < unArray.length; i++) {
            if (unArray[i] == false) {
                contador++;
            }
        }
        if (contador == 0) {
            retorno = true;
            return retorno;
        } else {
            return retorno;
        }

    }

    public static boolean[] convierteTrue(boolean[] unArray) {
        for (int i = 0; i < unArray.length; i++) {
            unArray[i] = true;
        }
        return unArray;
    }

}
