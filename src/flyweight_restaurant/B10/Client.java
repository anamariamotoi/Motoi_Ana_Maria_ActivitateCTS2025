package flyweight_restaurant.B10;

public class Client {
    private String nume;
    private String telefon;

    public Client(String nume, String telefon) {
        this.nume = nume;
        this.telefon = telefon;
    }

    public void afisare() {
        System.out.println("Client: " + nume + ", Tel: " + telefon);
    }
}
