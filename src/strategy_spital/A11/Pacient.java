package strategy_spital.A11;

public class Pacient {
    private String nume;
    private IPlata modPlata;

    public Pacient(String nume) {
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
