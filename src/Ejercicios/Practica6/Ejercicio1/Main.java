package Ejercicios.Practica6.Ejercicio1;
        /*
         Crea un método en cuyo código lances una excepción de tipo checked que consideres
         oportuna. Luego propágala indicando a quienes usan el método que puede lanzar esa
         excepción. Finalmente llama a este método desde otro distinto y captura la excepción
         mostrando un mensaje personalizado contenido en la excepción.

         A parte de la excepción anterior, haz que tu código del primer método pueda lanzar otra
         excepción más, en este caso una propia que tú te hayas creado y también captúrala junto a
         la otra
        */
public class Main {
    public static void main(String[] args) {
        int dividendo = 25;
        int divisor = 0;
        try {
            int resultado = division(dividendo, divisor);
            System.out.println(dividendo + " entre " + divisor + " es igual a " + resultado);
        } catch (ArithmeticException exception1) {
            System.err.println("Error: " + exception1.getMessage());
            System.err.println("Introduzca otro divisor e intentelo de nuevo.");
        } catch (Exception exception2){
            System.err.println("Error: " + exception2.getMessage());
            System.err.println("Introduzca otro dividendo e intentelo de nuevo.");
        }
    }

    public static int division(int dividendo, int divisor) throws Exception {
        if (divisor == 0) {
            throw new ArithmeticException("No se puede dividir entre cero.");
        } else if (dividendo == 0) {
            throw new Exception("No tiene sentido dividir 0 entre algo.");
        } else {
            return dividendo / divisor;
        }
    }
}