package Ejercicios.Actividad6_4;

public abstract class EsquemaVoraz {

    Object[] solucion;
    Object candidato;
    int etapa;

    public void voraz(){
        inicializa();
        while(!fin()){
            seleccionaYEliminaCandidatos();
            if(esPrometedor()){
                anotaEnSolucion();
            }
        }
    }

    protected abstract void anotaEnSolucion();
    protected abstract boolean esPrometedor();
    protected abstract boolean fin();
    protected abstract void inicializa();
    protected abstract void seleccionaYEliminaCandidatos();
}