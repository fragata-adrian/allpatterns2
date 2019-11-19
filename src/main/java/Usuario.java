public class Usuario implements IUsiaruioChat {
    private String nombre;
    private SalonDeChat salon;

    public Usuario(String nombre, SalonDeChat salon) {
        this.nombre = nombre;
        this.salon = salon;
    }

    @Override
    public void recibe(String de, String msg) {
        String s = "El uduario" + de + "te dice" + msg;
        System.out.println(nombre + ": " + s);
    }

    @Override
    public void envia(String a, String msg) {
        salon.envia(nombre, a, msg);
    }

    //Getters

    public String getNombre() {
        return nombre;
    }

    public SalonDeChat getSalon() {
        return salon;
    }

    //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalon(SalonDeChat salon) {
        this.salon = salon;
    }
}
