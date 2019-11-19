import autos.Auto;

public class Cliente {

    private int dinero;

    public Cliente(int dinero) {
        this.dinero = dinero;
    }

    public void solicitarPrestamo(int monto, Banco banco) {
        banco.solicitudPrestamo(monto);
        this.dinero += monto;
    }

    public void comprarAuto(Auto modelo) {
        if(modelo.getPrecio() <= this.dinero) {
            System.out.println("Que bien! tengo el dinero suficiente");
            this.dinero -= modelo.getPrecio();
        } else {
            System.out.println("Uhh, necesito un prestamo..");
            System.out.println("Dinero necesario: " + (modelo.getPrecio() - this.dinero));
        }
    }

    public int getDinero() {
        return dinero;
    }
}
