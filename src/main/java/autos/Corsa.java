package autos;

public class Corsa extends Auto{

    public Corsa(String color, int precio) {
        super(color, precio);
    }

    @Override
    public int capacidad() {
        return 4;
    }

    @Override
    public int velocidadMaxima() {
        return 150;
    }

    @Override
    public String combustible() {
        return "Nafta";
    }


}
