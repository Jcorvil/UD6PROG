package Ejemplos.ExcepcionesdeUsuario;

import java.util.LinkedList;
import java.util.List;

public class ExcepcionesdeUsuario {
    public static void main(String[] args) {
        List<Integer> lista = new LinkedList<>();

        System.out.println("•:•LISTA ORIGINAL•:•");
        listaRepetidos(lista, 3);
        listaRepetidos(lista, 4);
        listaRepetidos(lista, 6);
        listaRepetidos(lista, 9);
        listaRepetidos(lista, 14);

        try{
            System.out.println("Se añaden los valores: ");
            listaRepetidos(lista, 6);
        } catch(noRepetidoException repe){
            repe.printStackTrace();
            System.out.println(repe.getMessage());
        } finally {
            System.out.println("•:•FIN DEL PROGRAMA•:•");
        }

    }


    //Podemos crear una excepción personalizada. En este caso, usamos la excepción "IllegalArgumentException" que
    //renombramos a noRepetidoException.
    public static void listaRepetidos (List<Integer> lista, Integer entero){
        if(lista.contains(entero)){
            throw new noRepetidoException("No se puede añadir un valor duplicado.");
        } else {
            lista.add(entero);
            System.out.println(entero);
        }
    }
}
