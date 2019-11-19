package facade;

import facade.inmobiliaria.Inmobiliaria;
import facade.inmobiliaria.sistema.AdministracionAlquiler;
import facade.inmobiliaria.sistema.CuentasAPagar;
import facade.inmobiliaria.sistema.MuestraPropiedad;
import facade.inmobiliaria.sistema.VentaInmueble;
import facade.personas.Cliente;
import facade.personas.Interesado;

/*
* Bien, veamos ahora 2 tipos de clientes. El primero no llamará al Facade y el segundo si lo utilizará. Veremos
* como el primero esta obligado a conocer muchos detalles de los subsistemas y el segundo no.
*/
public class Main {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        Interesado i = new Interesado();

        //Primer Cliente:
        Inmobiliaria inmo = new Inmobiliaria();

        inmo.atencionCliente(c);
        inmo.atencionInteresado(i);

        MuestraPropiedad muestraPropiedad = new MuestraPropiedad();
        muestraPropiedad.mostrarPropiedad(123);

        VentaInmueble ventaInmueble = new VentaInmueble();
        ventaInmueble.gestionarVenta();

        AdministracionAlquiler alquiler = new AdministracionAlquiler();
        alquiler.cobro(1200);

        CuentasAPagar cuentasAPagar = new CuentasAPagar();
        cuentasAPagar.pagoPropietario(1100);

        //Segundo Cliente (lo mismo pero usando el facade)

        Inmobiliaria inmo2 = new Inmobiliaria();

        inmo2.atender(c);
        inmo2.atender(i);

        inmo2.mostrarPropiedad(123);

        inmo2.gestionarVenta();

        inmo2.cobrarAlquiler(1200);

        inmo2.pagar(1100);

    }
}
