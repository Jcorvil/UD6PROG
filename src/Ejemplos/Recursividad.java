package Ejemplos;

public class Recursividad {
    public static void main(String[] args) {
        System.out.println("Cuenta recursiva");
        cuentaAtras(10);
        System.out.println("•:•:•:•:•:•:•:•:•:•:•");
        System.out.println("Cuenta iterativa");
        cuentaAtrasBucle(10);

    }

    //Recursivo
    private static void cuentaAtras(int i) {
        if (i > 0) {
            System.out.println(i);
            cuentaAtras(i - 1);
        } else System.out.println("Fin de la cuenta atrás.");
    }

    //Iterativo
    private static void cuentaAtrasBucle (int i){
        while(i > 0){
            System.out.println(i);
            i = i - 1;
        }
        System.out.println("Fin de la cuenta atrás.");
    }
}