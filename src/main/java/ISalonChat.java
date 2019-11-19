public interface ISalonChat {

    void registra(Usuario participante);

    void envia(String de, String a, String msg);
}
