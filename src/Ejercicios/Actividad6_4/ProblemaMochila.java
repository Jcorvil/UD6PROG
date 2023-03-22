package Ejercicios.Actividad6_4;

import java.util.Arrays;

public class ProblemaMochila extends EsquemaVoraz {

    private Integer max;
    private int n;
    int cantidadObjetos;
    private int[] peso;
    private int[] valores;
    Integer pesoActual;

    public ProblemaMochila(int n, Integer max) {
        this.n = n;
        this.max = max;
        this.peso = peso;
        this.valores = valores;
    }


    @Override
    protected void inicializa(){
        solucion = new Object[peso.length];
        Arrays.fill(solucion, 0);
        pesoActual = 0;
    }

    @Override
    protected boolean fin(){
        return max == pesoActual;
    }

    @Override
    protected void seleccionaYEliminaCandidatos() {
        int i = 1;
        Integer mayor = valores[i]/peso[i];
        for (i = 0; i < n; i++) {
            if (mayor < valores[i]/peso[i]){
                mayor = valores[i]/peso[i];
            }
        }
        candidato = mayor;
        etapa = i;
        valores[etapa] = 0;
    }

    @Override
    protected boolean esPrometedor(){
        return true;
    }

    @Override
    protected void anotaEnSolucion(){

    }


}