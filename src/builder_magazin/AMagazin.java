package builder_magazin;

import java.util.ArrayList;
import java.util.List;

public abstract class AMagazin {
    protected IPodea podea;
    protected String denumire;
    protected float suprafata;
    protected int nrIntrari;
    protected List<IDecoratiune> decorariuni = null;

    public AMagazin(IPodea podea, String denumire, float suprafata, int nrIntrari) {
        this.podea = podea;
        this.denumire = denumire;
        this.suprafata = suprafata;
        this.nrIntrari = nrIntrari;
    }
}
