package Ejercicios.Actividad6_1;

//1. ¿Cuál es el nombre en Java de la clase que define las excepciones, y de la que debe heredar cualquier clase
// que queramos usar para representar una excepción?
    //La clase "Exception" o "throwable".

//2. ¿Cuál es el nombre en Java de la clase que representa las excepciones que se producen al invocar un
// método de un objeto cuyo valor es “null”?
    //NullPointerException.

//3. ¿Cuál es el nombre en Java de la clase que representa las excepciones que se producen al obtener un
// comportamiento anómalo en la entrada / salida de información?
    //IOException.


public class Main {
    public static void main(String[] args) throws Exception {

        //4. Observa el siguiente fragmento de código:
        //String [] array_string = new String [25];
        //System.out.println (array_string [3].length());
        //¿Qué excepción se produciría en el mismo?
            /*
            Se produciría un NullPointerException, ya que no se han añadido valores al array, por lo que está
             lleno de nulos, lo que hace que devuelva null.
            */


        //5. Observa el siguiente fragmento de código:
        //String aux = "hola";
        //int aux2 = Integer.parseInt (aux);
        //¿Qué sucedería al ejecutar el mismo?
            /*
            Se produciría un NumberFormatException, ya que el .parseInt sirve para convertir una cadena en un entero.
            Si la cadena fuese, por ejemplo, 10, no daría error, ya que '10' si puede ser un entero, una palabra
            no se puede convertir a un número.
            */


        //6. Escribe un método auxiliar de nombre “caracterEn” en Java que realice la siguiente acción:
        /*
         Recibe como parámetros una cadena (String) y un entero (int);
         Si el entero está entre 0 y la longitud de la cadena (puedes hacer uso del método “length(): int” de
         la clase “String”) devuelve el carácter en la posición correspondiente (puedes hacer uso del método
         “charAt(int)” de la clase “String”).
         En caso contrario, construye y lanza una excepción de tipo “Exception”.
         */

        String cadena = "Hola";
        int entero = -1;

        try{
            char caracter = caracterEn(cadena, entero);
            System.out.println("El caracter de la posición introducida es " + "'" + caracter + "'");
        } catch (Exception excepcion) {
            excepcion.printStackTrace();
            System.out.println(excepcion.getMessage());
        }


    }

    public static char caracterEn (String cadena, int entero) throws IllegalArgumentException{
        if (entero >= 0 && entero < cadena.length()){
            return cadena.charAt(entero);
        } else if (entero < 0){
            throw new IllegalArgumentException("El entero dado es menor a la longitud de la cadena");
        } else{
            throw new IllegalArgumentException("El entero dado es mayor a la longitud de la cadena");
        }

    }
}