package facade.inmobiliaria;

import facade.inmobiliaria.sistema.AdministracionAlquiler;
import facade.inmobiliaria.sistema.CuentasAPagar;
import facade.inmobiliaria.sistema.MuestraPropiedad;
import facade.inmobiliaria.sistema.VentaInmueble;
import facade.personas.Cliente;
import facade.personas.Interesado;
import facade.personas.Persona;
import facade.personas.Propietario;

//Ahora haremos una clase llamada Inmobiliaria que será nuestro Facade

public class Inmobiliaria {
    private MuestraPropiedad muestraPropiedad;
    private VentaInmueble ventaInmueble;
    private CuentasAPagar cuentasAPagar;
    private AdministracionAlquiler administracionAlquiler;

    public Inmobiliaria() {
        this.muestraPropiedad = new MuestraPropiedad();
        this.ventaInmueble = new VentaInmueble();
        this.cuentasAPagar = new CuentasAPagar();
        this.administracionAlquiler = new AdministracionAlquiler();
    }

    public void atencionCliente(Persona p) {
        System.out.println("Atendiendo a un cliente");
    }

    public void atencionPropietario(Persona p) {
        System.out.println("Atendiendo a un propietario");
    }

    public void atencionInteresado(Persona p) {
        System.out.println("Atendiendo a un interesado");
    }

    //Aqui comienza el facade

    public void atender(Persona p) {
        if(p instanceof Cliente) {
            this.atencionCliente(p);
        } else if(p instanceof Propietario) {
            this.atencionPropietario(p);
        } else if(p instanceof Interesado) {
            this.atencionInteresado(p);
        }
    }

    public void mostrarPropiedad(int numero) {
        muestraPropiedad.mostrarPropiedad(numero);
    }

    public void gestionarVenta() {
        ventaInmueble.gestionarVenta();
    }

    public void cobrarAlquiler(double monto) {
        administracionAlquiler.cobro(monto);
    }

    public void pagar(double monto) {
        cuentasAPagar.pagoPropietario(monto);
    }
}
