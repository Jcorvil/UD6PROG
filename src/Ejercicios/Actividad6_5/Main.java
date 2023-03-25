package Ejercicios.Actividad6_5;

public class Main {
    public static void main(String[] args) {
        int[] a = {1,3,6,9,12,15,28,29,33,49,52,61,70,83};
        int elementoABuscar = 28;
        System.out.println(divideVenceras(a, 0, a.length -1, elementoABuscar));
    }

    public static int divideVenceras (int[] a, int inicio, int fin, int elementoABuscar) {
        int medio = (inicio + fin) / 2;
            if (a[medio] == elementoABuscar) {
                return medio;
            } else if (a[medio] > elementoABuscar) {
                return divideVenceras(a, medio + 1, fin, elementoABuscar);
            } else {
                return divideVenceras(a, inicio, medio - 1, elementoABuscar);
            }
    }
}