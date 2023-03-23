package Ejercicios.Actividad6_4;

import java.util.Arrays;

public class ProblemaMochila extends EsquemaVoraz {

    private Double max;
    private Double n;
    private Double[] peso;
    private Double[] valores;
    Double pesoActual;

    public ProblemaMochila(Double n, Double max, Double[] peso, Double[]valores) {
        this.n = n;
        this.max = max;
        this.peso = peso;
        this.valores = valores;
    }


    @Override
    protected void inicializa(){
        solucion = new Object[peso.length];
        Arrays.fill(solucion, 0);
        pesoActual = Double.valueOf(0);
    }

    @Override
    protected boolean fin(){
        return max == pesoActual;
    }

    @Override
    protected void seleccionaYEliminaCandidatos() {
        Double mayor = Double.valueOf(valores[0])/peso[0];
        etapa = 0;
        for (int i = 1; i < n; i++) {
            if (mayor < Double.valueOf(valores[etapa])/peso[etapa]){
                mayor = Double.valueOf(valores[etapa])/peso[etapa];
                etapa = i;
            }
        }
        valores[etapa] = Double.valueOf(0);
    }

    @Override
    protected boolean esPrometedor(){
        return true;
    }

    @Override
    protected void anotaEnSolucion(){
        if (pesoActual + peso[etapa] <= max){
            candidato = 1;
        } else {
            candidato = Double.valueOf(max - pesoActual) / peso[etapa];
        }
        solucion[etapa] = candidato;
        pesoActual = Double.valueOf(pesoActual) + candidato * Double.valueOf(peso[etapa]);
    }

}