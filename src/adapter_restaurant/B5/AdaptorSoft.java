package adapter_restaurant.B5;

public class AdaptorSoft implements IPrintareFactura{
    private SoftBar softBar;

    public AdaptorSoft(SoftBar softBar) {
        this.softBar = softBar;
    }

    @Override
    public void printeazaFactura(Comanda comanda) {
        softBar.proceseazaComanda(comanda);

    }
}
