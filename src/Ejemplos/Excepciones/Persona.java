package Ejemplos.Excepciones;

public class Persona {
    private int edad;

    public int getEdad(){return edad;}

    public void setEdad(int edad) throws IllegalArgumentException{
        if(edad < 0){
            throw new IllegalArgumentException("La edad debe ser mayor a 0");
        }
        this.edad = edad;
    }

}