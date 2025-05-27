package composite_spital.A8;

public class Sectie extends ANod{
    private String numeSectie;

    public Sectie(String numeSectie) {
        this.numeSectie = numeSectie;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Denumire sectie:" + this.numeSectie);
    }

    @Override
    public void adauga(ANod copil) {
        throw new UnsupportedOperationException("Departamentele nu se pot adauga in sectii");
    }

    @Override
    public void sterge(ANod copil) {
        throw new UnsupportedOperationException("Departamentele nu se pot sterge din sectii");
    }

    @Override
    public ANod extrage(int index) {
        throw new UnsupportedOperationException("Departamentele nu se pot extrage din sectii");
    }
}
