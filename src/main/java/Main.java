public class Main {

//Veamos como funciona

    public static void main(String[] args) {
        SalonDeChat sala1 = new SalonDeChat();

        Usuario user1 = new Usuario("Juan", sala1);
        sala1.registra(user1);

        Usuario user2 = new Usuario("Pepe", sala1);
        sala1.registra(user2);

        Usuario user3 = new Usuario("Pedro", sala1);
        sala1.registra(user3);

        user1.envia("Pepe", "Hola como andas?");
        user2.envia("Juan", "Todo ok, vos?");
        user3.envia("Martin", "Mertin estas?");

    }
}
