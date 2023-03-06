package Ejercicios;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Excepcion {
    public static void main(String[] args) {
        System.out.println("•:•COMIENZO PROGRAMA DIVISIÓN•:•");
        try {
            lector("a");
            int dividendo = 5;
            int divisor = 0;
            System.out.println("Resultado: " + dividir(dividendo, divisor));
        }catch (ArithmeticException ex) {
            System.out.println("Imposible dividir entre 0");
        }catch (FileNotFoundException i){
            i.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            System.out.println("•:•FIN PROGRAMA DIVISIÓN•:•");
        }
    }

    private static int dividir(int dividendo, int divisor) throws ArithmeticException {
        return dividendo / divisor;
    }



private static void lector(String filepath) throws IOException {
        FileReader fileReader = new FileReader(filepath);
        System.out.println(fileReader.read());
        fileReader.close();
}

}