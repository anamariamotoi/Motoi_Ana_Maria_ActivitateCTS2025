package flyweight_spital.A10;

public class Pacient implements IPacient{
    private String nume;
    private String nrTelefon;
    private String adresa;

    public Pacient(String nume, String nrTelefon, String adresa) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresa = adresa;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public String getNume() {
        return nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public void afisareDetaliiPersonale() {
        System.out.println("Nume: " + this.nume + "\nNumar de telefon: " + this.nrTelefon + "\nAdresa: " + this.adresa);
    }
}
