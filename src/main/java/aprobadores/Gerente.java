package aprobadores;

public class Gerente implements Aprobador {
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
     *   Atiendo la solicitud del prestamo si el monto es mayor a 50000 y menor a 100000.
     *   Si el monto solicitado excede el que puede autorizar el
     *   "gerente", pasa la peticion al aprovador siguiente (siguiente).
     */
    @Override
    public void solicitudPrestamo(int monto) {
        if(monto > 50000 && monto <= 100000) {
            System.out.println("Prestamo aprobado por el gerente del banco.");
        } else {
            siguiente.solicitudPrestamo(monto);
        }
    }
}
