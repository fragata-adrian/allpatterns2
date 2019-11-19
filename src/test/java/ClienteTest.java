import autos.Corsa;
import autos.Kwid;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClienteTest {

    Cliente cliente;
    Banco bancoFrances;
    Corsa corsa;
    Kwid kwid;

    @BeforeMethod
    public void setUp() {
        cliente = new Cliente(40000);
        bancoFrances = new Banco();
        corsa = new Corsa("Gris", 150000);
        kwid = new Kwid("Blanco", 90000, false);
    }

    @Test
    public void testComprarUnCorsa() {
        cliente.comprarAuto(corsa);
        System.out.println("Dinero actual: " + cliente.getDinero());
        cliente.solicitarPrestamo(110000, bancoFrances);
        System.out.println("Dinero actual: " + cliente.getDinero());
        cliente.comprarAuto(corsa);
    }

    @Test
    public void testComprarUnKwidSinTanqueAdicional() {
        cliente.comprarAuto(kwid);
        System.out.println("Dinero actual: " + cliente.getDinero());
        cliente.solicitarPrestamo(50000, bancoFrances);
        System.out.println("Dinero actual: " + cliente.getDinero());
        cliente.comprarAuto(kwid);
    }

    @Test
    public void testComprarUnKwidConTanqueAdicional() {
        kwid.setTanqueAdicional(true);
        cliente.comprarAuto(kwid);
        System.out.println("Dinero actual: " + cliente.getDinero());
        cliente.solicitarPrestamo(54800, bancoFrances);
        System.out.println("Dinero actual: " + cliente.getDinero());
        cliente.comprarAuto(kwid);
    }
}