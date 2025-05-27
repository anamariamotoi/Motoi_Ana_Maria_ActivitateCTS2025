package proxy_spital.A9;

public class Pacient {
    private String nume;
    private boolean areAsigurare;

    public Pacient(String nume, boolean areAsigurare) {
        this.nume = nume;
        this.areAsigurare = areAsigurare;
    }

    public String getNume() {
        return nume;
    }

    public boolean isAreAsigurare() {
        return areAsigurare;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setAreAsigurare(boolean areAsigurare) {
        this.areAsigurare = areAsigurare;
    }

    @Override
    public String toString() {
        return "Pacient[" +
                "nume='" + nume + '\'' +
                ", areAsigurare=" + areAsigurare +
                ']';
    }
}
