package adapter_restaurant.B5;

public class Comanda {
    private int nrComanda;
    private int nrProduse;
    private int totalPlata;

    public Comanda(int nrComanda, int nrProduse, int totalPlata) {
        this.nrComanda = nrComanda;
        this.nrProduse = nrProduse;
        this.totalPlata = totalPlata;
    }

    public int getNrComanda() {
        return nrComanda;
    }

    public int getNrProduse() {
        return nrProduse;
    }

    public int getTotalPlata() {
        return totalPlata;
    }

    public void afisareDetaliiComanda(){
        System.out.println("Comanda: " + this.nrComanda + "\nNumar produse: " + this.nrProduse + "\nTotal plata: " + this.totalPlata);
    }
}
