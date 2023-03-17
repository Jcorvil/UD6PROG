package Ejercicios.Actividad6_3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 1");
        int[] arrayNumeros = {1, 2, 5, 108, 25, 82};
        System.out.println("El número mayor del array es el " + numeroMayor(arrayNumeros));
        System.out.println("•:•:•:•:•:•:•:•:•:•");
    }

    //Ejercicio 1
    //Realiza un algoritmo que dado un conjunto de números, encuentre el número más grande
    public static int numeroMayor(int[] arrayNumeros){
        int numeroMayor = 0;
        for (int i = 0; i < arrayNumeros.length; i++) {
            if (arrayNumeros[i] > numeroMayor){
                numeroMayor = arrayNumeros[i];
            }
        }
        return numeroMayor;
    }

    //Ejercicio 2


}