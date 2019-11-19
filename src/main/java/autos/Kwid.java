package autos;

public class Kwid extends Auto {

    private boolean tanqueAdicional;

    public Kwid(String color, int precio, boolean tanqueAdicional) {
        super(color, precio);
        this.tanqueAdicional = tanqueAdicional;
    }

    @Override
    public int capacidad() {
        if(this.tanqueAdicional) {
            return 3;
        } else {
            return 4;
        }
    }

    @Override
    public int velocidadMaxima() {
        if(this.tanqueAdicional) {
            return 110;
        } else {
            return 120;
        }
    }

    @Override
    public String combustible() {
        if(this.tanqueAdicional) {
            return "Gas";
        } else {
            return "Nafta";
        }
    }

    //setter
    public void setTanqueAdicional(boolean tanqueAdicional) {
        this.tanqueAdicional = tanqueAdicional;
    }

    //Getter
    public boolean getTanqueAdicional() {
        return tanqueAdicional;
    }

    @Override
    public int getPrecio() {
        if(this.tanqueAdicional) {
            return super.getPrecio() + 4800;
        } else {
            return super.getPrecio();
        }
    }

}
