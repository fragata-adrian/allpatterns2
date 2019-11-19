package builder.autos;

public class Auto {
    private int cantidadDePuertas;
    private String modelo;
    private String marca;
    private Motor motor;

    //Getters
    public int getCantidadDePuertas() {
        return cantidadDePuertas;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public Motor getMotor() {
        return motor;
    }

    //Setters
    public void setCantidadDePuertas(int cantidadDePuertas) {
        this.cantidadDePuertas = cantidadDePuertas;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
