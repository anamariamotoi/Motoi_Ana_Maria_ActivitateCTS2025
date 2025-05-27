package flyweight_restaurant.B10;



public class Program {
    public static void main(String[] args) {
        Client client = ClientFactory.getClient("Ion Popescu", "0711111111");

        Rezervare s1 = new Rezervare(client, 2, "12.06.2025");

        client.afisare();
        System.out.println(ClientFactory.getNrClienti());
    }
}
