package decorator_restaurant.B7;

public class NotaDePlata extends ANotaDePlata{
    private int nrNotaPlata;
    private String data;
    private float pret;

    public NotaDePlata(int nrNotaPlata, String data, float pret) {
        this.nrNotaPlata = nrNotaPlata;
        this.data = data;
        this.pret = pret;
    }

    public float getPret() {
        return pret;
    }

    public String getData() {
        return data;
    }

    public int getNrNotaPlata() {
        return nrNotaPlata;
    }

    public void setNrNotaPlata(int nrNotaPlata) {
        this.nrNotaPlata = nrNotaPlata;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    @Override
    public void printareNota() {
        System.out.println("Nota de plata cu numarul: " + this.nrNotaPlata + "\nData: " + this.data +
                "\nPret: " + this.pret);
    }
}
