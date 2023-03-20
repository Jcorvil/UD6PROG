package Ejemplos;

import java.util.Arrays;

public class EjemploDyV {
    public static void main(String[] args) {
        int[] a = {-2, -1, 3, 5, 8, 10};
        int num = 8;
        int posicion = dyv(a, num);
        System.out.println("El número " + num + " está en la posición: " + posicion);
    }

    private static int dyv(int[] a, int num) {
        int pos = a.length / 2;
        if (a.length == 0){
            return -1;
            //Caso base
            //Si el numero dado está en el medio, se devuelve la posición directamente sin tener que realizar
            //ninguna operación
        } else if (num == a[pos]){
            return pos;
            //Si el numero dado se encuentra en la segunda mitad del array...
        } else if (num > a[pos]){
            //...
            return pos + 1 + dyv(Arrays.copyOfRange(a, pos + 1, a.length), num);
        } else {
            return dyv(Arrays.copyOfRange(a, 0, pos), num);
        }
    }
}