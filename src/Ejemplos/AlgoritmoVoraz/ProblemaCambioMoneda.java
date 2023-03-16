package Ejemplos.AlgoritmoVoraz;


public class ProblemaCambioMoneda extends EsquemaVoraz {
    //Inputs
    int[]monedas;
    int cambio;

    //Atributos internos del algoritmo
    int []solucion;
    int candidato;
    int etapa;

    public ProblemaCambioMoneda(int[] monedas, int cambio) {
        this.monedas = monedas;
        this.cambio = cambio;
    }


    @Override
    protected void inicializa(){
        solucion = new int[monedas.length];
        candidato = 0;
        etapa = 0;
    }

    @Override
    protected boolean fin(){
        return etapa == monedas.length;
    }

    @Override
    protected void seleccionaYEliminaCandidatos() {
        candidato = cambio/monedas[etapa];
    }

    @Override
    protected boolean esPrometedor(){
        return true;
    }

    @Override
    protected void anotaEnSolucion(){
        solucion[etapa] = candidato;
        cambio = cambio - monedas[etapa] * candidato;
        etapa++;
    }

}