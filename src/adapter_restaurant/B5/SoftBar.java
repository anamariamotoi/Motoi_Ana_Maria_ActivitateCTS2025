package adapter_restaurant.B5;

public class SoftBar {
    private Comanda comanda;

    public SoftBar(Comanda comanda) {
        this.comanda = comanda;
    }

    public void proceseazaComanda(Comanda comanda){
        System.out.println("Comanda " +comanda.getNrComanda() + " a fost procesata");
        comanda.afisareDetaliiComanda();
    }

}
