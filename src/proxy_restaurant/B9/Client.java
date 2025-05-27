package proxy_restaurant.B9;

public class Client {
    private String nume;
    private int nrPersoane;
    private String data;
    private String ora;

    public Client(String nume, int nrPersoane, String data, String ora) {
        this.nume = nume;
        this.nrPersoane = nrPersoane;
        this.data = data;
        this.ora = ora;
    }

    public String getNume() {
        return nume;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    public String getOra() {
        return ora;
    }

    public String getData() {
        return data;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setOra(String ora) {
        this.ora = ora;
    }

    @Override
    public String toString() {
        return "Client[" +
                "nume='" + nume + '\'' +
                ", nrPersoane=" + nrPersoane +
                ", data='" + data + '\'' +
                ", ora='" + ora + '\'' +
                ']';
    }
}
