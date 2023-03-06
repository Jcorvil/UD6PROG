package Ejemplos.Excepciones;

public class Excepciones {
    public static void main(String[] args) {
        System.out.println("•:•COMIENZO PROGRAMA DIVISIÓN•:•");
        try {
            int dividendo = 5;
            int divisor = 0;
            System.out.println("Resultado: " + dividir(dividendo, divisor));
        }catch (ArithmeticException ex) {
            System.out.println("Imposible dividir entre 0");
            //.getMessage muestra una explicación del error.
            System.out.println(ex.getMessage());
            //.printStackTrace muestra el error que se imprimiría por consola.
            ex.printStackTrace();
            //Los "catch" de tipo 'Exception' se deben poner siempre al final.
        }catch (Exception ex){
            System.out.println("Imposible dividir entre 0");
        }finally{
            System.out.println("•:•FIN PROGRAMA DIVISIÓN•:•");
        }
    }

    private static int dividir(int dividendo, int divisor) throws ArithmeticException {
        return dividendo / divisor;
    }

}