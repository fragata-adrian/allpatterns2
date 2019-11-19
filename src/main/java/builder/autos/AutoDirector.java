package builder.autos;

import builder.autos.AutoBuilder;

public class AutoDirector {
    //No es necesario que exista la palabra "Director"
    //Esta clase podria llamarse Concesionaria, Garage, fabricaDeAutos, etc.

    private AutoBuilder autoBuilder;

    public void construirAuto(){
        autoBuilder.crearAuto();
        autoBuilder.buildMarca();
        autoBuilder.buildModelo();
        autoBuilder.buildMotor();
        autoBuilder.buildPuertas();
    }

    //Getter
    public Auto getAuto() {
        return autoBuilder.getAuto();
    }

    //Setter
    public void setAutoBuilder(AutoBuilder autoBuilder) {
        this.autoBuilder = autoBuilder;
    }
}
