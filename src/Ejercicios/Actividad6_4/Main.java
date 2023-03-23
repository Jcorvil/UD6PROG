package Ejercicios.Actividad6_4;

import java.util.Arrays;

public class Main {

    //Dados n objetos de peso w[1..n] y valores v[1..n] y una mochila de peso máximo m, calcular las facciones
    // x[1..n] tal que se consiga llenar la mochila con el mayor valor total posible, teniendo en cuenta la
    // capacidad de la misma. Por tanto, consiste en seleccionar los objetos de mayor valor por unidad de peso
    // e ir añadiéndolos a la mochila hasta llenarla.
    //Ejemplo:
    //pesoMaximo = 100
    //cantidadObjetos = 5
    //peso = [10, 20, 30, 40, 50]
    //valores = [20, 30, 66, 40, 60]
    //Entonces, x = [1, 1, 1, 0, 0.8] → valor total = 164
    //Para resolver el problema se pide seguir la estrategia de algoritmo voraz.

    public static void main(String[] args) {
        int pesoMaximo = 100;
        int cantidadObjetos = 5;
        Double[] peso = {10d, 20d, 30d, 40d, 50d};
        Double[] valores = {20d, 30d, 66d, 40d, 60d};

        ProblemaMochila pmf = new ProblemaMochila(cantidadObjetos, pesoMaximo, peso, valores);
        pmf.voraz();
        System.out.println(Arrays.toString(pmf.solucion));

    }
}