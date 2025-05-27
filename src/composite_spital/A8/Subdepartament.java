package composite_spital.A8;

public class Subdepartament extends ANod{
    private String denumireSubdepartament;

    public Subdepartament(String denumireSubdepartament) {
        this.denumireSubdepartament = denumireSubdepartament;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Denumire subdepartament:" + this.denumireSubdepartament);
    }

    @Override
    public void adauga(ANod copil) {
        throw new UnsupportedOperationException("Departamentele nu se pot adauga in subdepartamente");
    }

    @Override
    public void sterge(ANod copil) {
        throw new UnsupportedOperationException("Departamentele nu se pot sterge din subdepartamente");
    }

    @Override
    public ANod extrage(int index) {
        throw new UnsupportedOperationException("Departamentele nu se pot extrage din subdepartamente");
    }
}
