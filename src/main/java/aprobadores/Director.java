package aprobadores;

public class Director implements Aprobador {
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
     *  Atiendo la solicitud del prestamo si el monto es mayor a 100000.
     *  Al ser el aprobador con el rango mas alto en el banco este no tiene
     *  un siguiente superior. La varible queda nula.
     */
    @Override
    public void solicitudPrestamo(int monto) {
        if(monto > 100000) {
            System.out.println("Prestamo aprobado por el director del banco");
        }
    }
}
