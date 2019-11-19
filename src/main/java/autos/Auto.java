package autos;

public abstract class Auto {
    private String color;
    private int precio;

    public Auto(String color, int precio) {
        this.color = color;
        this.precio = precio;
    }

    public abstract int capacidad();

    public abstract int velocidadMaxima();

    public abstract String combustible();

    public String getColor() {
        return color;
    }

    public int getPrecio() {
        return precio;
    }
}
