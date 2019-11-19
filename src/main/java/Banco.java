import aprobadores.*;

//El banco sera quien organice la cadena (Chain Of Responsibility).
public class Banco implements Aprobador {

    //En este caso el siguiente es el primer aprobador en la cadena.
    private Aprobador siguiente;

    @Override
    public Aprobador getSiguiente() {
        return siguiente;
    }

    @Override
    public void setSiguiente(Aprobador siguiente) {
        this.siguiente = siguiente;
    }

    /*
    * Aqui se aplica la interfaz que va delegando la tarea de aprobar
    * la solicitud del prestamo.
    */
    @Override
    public void solicitudPrestamo(int monto) {
        System.out.println("Solicitando prestamo...");

        //Seteo los aprobadores localmente en el metodo.
        Ejecutivo ejecutivo = new Ejecutivo();
        this.setSiguiente(ejecutivo);

        LiderEjecutivo lider = new LiderEjecutivo();
        ejecutivo.setSiguiente(lider);

        Gerente gerente = new Gerente();
        lider.setSiguiente(gerente);

        Director director = new Director();
        gerente.setSiguiente(director);

        //Inicio la cadena para buscar un aprobador apto para aceptar la solicitud.
        siguiente.solicitudPrestamo(monto);
    }
}
