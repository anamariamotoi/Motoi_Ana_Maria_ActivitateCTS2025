package strategy_restaurant.B11;

public class Client {
    private String nume;
    private IPlata modPlata;

    public Client(String nume) {
        this.nume = nume;
    }

    public void setModPlata(IPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void plateste(float suma) {
        System.out.print(this.nume + ": ");
        modPlata.plateste(suma);
    }
}
