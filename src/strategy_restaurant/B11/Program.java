package strategy_restaurant.B11;

public class Program {
    public static void main(String[] args) {
        Client client = new Client("Maria");
        client.setModPlata(new PlataCash());
        client.plateste(250);

        client.setModPlata(new PlataCard());
        client.plateste(140);
    }
}
