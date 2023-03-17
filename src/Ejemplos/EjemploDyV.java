package Ejemplos;

import java.util.Arrays;

public class EjemploDyV {
    public static void main(String[] args) {
        int[] a = {-2, -1, 3, 5, 8, 10};
        int num = 3;
        int posicion = dyv(a, num);
        System.out.println("El número " + num + " está en la posición: " + posicion);
    }

    private static int dyv(int[] a, int num) {
        int medio = a.length / 2;
        //Caso base
        //Si el número que se busca está justo en el medio, ya se resuelve.
        if (a[medio] == num){
            return medio;
        } else if (num < a[medio]) {
            return dyv(Arrays.copyOfRange(a, 0, medio), num);
        } else
            return dyv(Arrays.copyOfRange(a, medio, a.length), num);

    }
}