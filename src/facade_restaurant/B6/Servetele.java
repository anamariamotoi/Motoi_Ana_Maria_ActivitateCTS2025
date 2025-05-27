package facade_restaurant.B6;

public class Servetele {
    private Masa masa;

    public Servetele(Masa masa) {
        this.masa = masa;
    }

    public boolean areServetele(Masa masa){
        return masa.isAreServetele();
    }
}
