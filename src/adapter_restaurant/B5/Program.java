package adapter_restaurant.B5;

public class Program {
    public static void main(String[] args) {
        Comanda comanda = new Comanda(1, 3, 80);
        SoftBar softBar = new SoftBar(comanda);

        AdaptorSoft adaptorSoft = new AdaptorSoft(softBar);
        adaptorSoft.printeazaFactura(comanda);
    }
}
