package Ejercicios;

public class EjercicioFactorial {
    public static void main(String[] args) {
        System.out.println("Recursivo");
        System.out.println(factorialRecursivo(5));
        System.out.println("•:•:•:•:•:•:•:•:•");
        System.out.println("Iterativo");
        System.out.println(factorialIterativo(5));

    }

    private static int factorialRecursivo(int i) {
        if (i > 1) {
            return i * factorialRecursivo(i - 1);
        }
        else return 1;
    }

    private static int factorialIterativo(int i){
        int factorial = 1;
        for (int j = i; j > 0; j--){
            factorial = factorial * j;
        }
        return factorial;
    }
}