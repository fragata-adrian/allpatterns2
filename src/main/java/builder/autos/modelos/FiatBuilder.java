package builder.autos.modelos;

import builder.autos.AutoBuilder;
import builder.autos.Motor;

public class FiatBuilder extends AutoBuilder {

    @Override
    public void buildMarca() {
        auto.setMarca("Fiat");
    }

    @Override
    public void buildModelo() {
        auto.setModelo("Palio");
    }

    @Override
    public void buildMotor() {
        Motor motor = new Motor();
        motor.setNumero(233559);
        motor.setPotencia("23 HP");
        auto.setMotor(motor);
    }

    @Override
    public void buildPuertas() {
        auto.setCantidadDePuertas(2);
    }
}
