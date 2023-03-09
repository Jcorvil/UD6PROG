package Ejercicios;

public class ExcepcionRepaso {
    public static void main(String[] args) {
        int a = 0;
        int b = 300;

        System.out.println("•:•COMIENZO PROGRAMA•:•");
        try{
            System.out.println(cociente(a, b));
        } catch (ArithmeticException co) {
            System.out.println("Se ha producido un error.");
        } finally {
            System.out.println("•:•FIN DEL PROGRAMA•:•");
        }

    }

    public static int cociente(Integer a, Integer b) throws ArithmeticException{
        return b/a;
    }

}