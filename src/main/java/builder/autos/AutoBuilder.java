package builder.autos;

import builder.autos.Auto;

/*
* Siguiendo con nuestro ejemplo, definimos nuestro Builder llamado AutoBuilder.
*  El Builder define al menos dos cosas:
*  un método para devolver el Producto (el auto en nuestro caso)
*  y los métodos necesarios para la construcción del mismo.
*/
public abstract class AutoBuilder {
    protected Auto auto;

    public Auto getAuto() {
        return auto;
    }

    public void crearAuto() {
        auto = new Auto();
    }

    public abstract void buildMarca();

    public abstract void buildModelo();

    public abstract void buildMotor();

    public abstract void buildPuertas();
}
