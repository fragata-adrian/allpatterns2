package aprobadores;

public class LiderEjecutivo implements Aprobador {
    private Aprobador siguiente;

    @Override
    public void setSiguiente(Aprobador siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public Aprobador getSiguiente() {
        return this.siguiente;
    }

    /*
     *   Atiendo la solicitud del prestamo si el monto es mayor a 10000 y menor a 50000.
     *   Si el monto solicitado excede el que puede autorizar el
     *   "lider ejecutivo", pasa la peticion al aprovador siguiente (siguiente).
     */
    @Override
    public void solicitudPrestamo(int monto) {
        if(monto > 10000 && monto <= 50000 ) {
            System.out.println("Prestamo aprobado por el lider Ejecutivo del banco.");
        } else {
            siguiente.solicitudPrestamo(monto);
        }
    }
}
