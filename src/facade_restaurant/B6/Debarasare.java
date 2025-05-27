package facade_restaurant.B6;

public class Debarasare {
    private Masa masa;

    public Debarasare(Masa masa) {
        this.masa = masa;
    }

    public boolean esteDebarasata(Masa masa){
        return masa.isEsteDebarasata();
    }
}
