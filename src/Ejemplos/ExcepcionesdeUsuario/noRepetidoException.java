package Ejemplos.ExcepcionesdeUsuario;

public class noRepetidoException extends IllegalArgumentException{
    public noRepetidoException (String mesage){
        super(mesage);
    }
}