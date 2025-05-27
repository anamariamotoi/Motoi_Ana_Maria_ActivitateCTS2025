package flyweight_restaurant.B10;

public class Rezervare {
    private int masa;
    private String data;
    private Client client;

    public Rezervare(Client client, int masa, String data) {
        this.client = client;
        this.masa = masa;
        this.data = data;
    }

    public void afisareRezervare() {
        client.afisare();
        System.out.println("Masa: " + this.masa + "\nData: " + this.data);
    }
}
