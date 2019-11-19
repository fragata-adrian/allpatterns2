package aprobadores;

public interface Aprobador {
    void setSiguiente(Aprobador siguiente);
    Aprobador getSiguiente();
    void solicitudPrestamo(int monto);
}
