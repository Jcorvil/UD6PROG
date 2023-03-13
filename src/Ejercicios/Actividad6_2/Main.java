package Ejercicios.Actividad6_2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 1");
        ordenInverso(5);
        System.out.println("•:•:•:•:•:•:•:•:•:•");
        System.out.println("Ejercicio 2");
        System.out.println(sumaNumeros(5));
        System.out.println("•:•:•:•:•:•:•:•:•:•");
        System.out.println("Ejercicio 3");
        System.out.println(fibonacci(7));
        System.out.println("•:•:•:•:•:•:•:•:•:•");
        System.out.println("Ejercicio 4");

        System.out.println("•:•:•:•:•:•:•:•:•:•");


    }

    //Ejercicio 1
    //Crea una función que imprima los números naturales en orden inverso comenzando por el número n.
    private static void ordenInverso(int n){
        if (n > 0) {
            System.out.println(n);
            ordenInverso(n - 1);
        }
    }


    //Ejercicio 2
    //Calcula la suma de los primeros n números naturales utilizando recursividad.
    private static int sumaNumeros(int n){
        if (n > 0) {
            return n + sumaNumeros(n - 1);
        } else return 0;
    }


    //Ejercicio 3
    //Realiza una función que calcule el n-ésimo término de la sucesión de Fibonacci.
    //Esta sucesión se caracteriza por estar definida naturalmente de manera recursiva, pues consiste en que
    //cada número de la sucesión se obtiene sumando los dos enteros positivos que le preceden, comenzando la
    //sucesión por los números 0 y 1. Por lo tanto tendría la siguiente forma:
    //0, 1, 1, 2, 3, 5, 8, 13, 21, 34…. hasta n
    

    private static int fibonacci(int n){
        if (n == 0){
            return 0;
        } else if (n == 1) {
            return 1;
        } else{
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    //Ejercicio4
    //Crea un método que calcule el máximo común divisor (MCD) de dos números enteros (utilizando la división euclídea).
    //El algoritmo que hay que implementar se conoce como algoritmo de euclides, tal vez os suene de algo.



}