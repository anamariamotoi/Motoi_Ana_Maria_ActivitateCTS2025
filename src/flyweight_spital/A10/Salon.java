package flyweight_spital.A10;

public class Salon {
    private int nrSalon;
    private int nrPat;
    private int nrZileSpitalizare;
    private Pacient pacientInternat;

    public Salon(int nrSalon, int nrPat, int nrZileSpitalizare, Pacient pacient) {
        this.nrSalon = nrSalon;
        this.nrPat = nrPat;
        this.nrZileSpitalizare = nrZileSpitalizare;
        this.pacientInternat = pacient;
    }

    public int getNrSalon() {
        return nrSalon;
    }

    public int getNrPat() {
        return nrPat;
    }

    public int getNrZileSpitalizare() {
        return nrZileSpitalizare;
    }

    public Pacient getPacientInternat() {
        return pacientInternat;
    }

    public void setNrSalon(int nrSalon) {
        this.nrSalon = nrSalon;
    }

    public void setNrPat(int nrPat) {
        this.nrPat = nrPat;
    }

    public void setNrZileSpitalizare(int nrZileSpitalizare) {
        this.nrZileSpitalizare = nrZileSpitalizare;
    }

    public void setPacientInternat(Pacient pacientInternat) {
        this.pacientInternat = pacientInternat;
    }

    @Override
    public String toString() {
        return "Salon{" +
                "nrSalon=" + nrSalon +
                ", nrPat=" + nrPat +
                ", nrZileSpitalizare=" + nrZileSpitalizare +
                ", pacientInternat=" + pacientInternat +
                '}';
    }
}
