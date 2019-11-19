package builder;

import builder.autos.Auto;
import builder.autos.AutoDirector;
import builder.autos.modelos.FordBuilder;

//La invocación desde un cliente sería:

public class Main {
    public static void main(String[] args) {
        AutoDirector director = new AutoDirector();
        director.setAutoBuilder(new FordBuilder());
        director.construirAuto();
        Auto auto = director.getAuto();

        System.out.println(auto.getMarca());
        System.out.println(auto.getModelo());
    }
}
