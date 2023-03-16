package Ejemplos.AlgoritmoVoraz;

public abstract class EsquemaVoraz {

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