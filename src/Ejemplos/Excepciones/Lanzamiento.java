package Ejemplos.Excepciones;

public class Lanzamiento {
    public static void main(String[] args) {

        try{
            Persona persona1 = new Persona();
            persona1.setEdad(-1);
            System.out.println("Edad válida.");
        } catch (IllegalArgumentException a){
            System.out.println(a.getMessage());
        }

    }
}