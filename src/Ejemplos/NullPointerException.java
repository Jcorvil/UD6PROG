package Ejemplos;


//NullPointerException ocurre cuando se intenta llamar algo que hace referencia a un valor nulo.

public class NullPointerException {
    public static void main(String[] args) {
        ejemplo();
    }

    private static void ejemplo(){
        String s = null;
        s.equals("null");
    }

}