package builder_magazin;

import java.util.ArrayList;

public class Magazin extends AMagazin {

    public Magazin(IPodea podea, String denumire, float suprafata, int nrIntrari) {
        super(podea, denumire, suprafata, nrIntrari);
    }

    void addDecoratiune(IDecoratiune d){
        if(this.decorariuni==null){
            this.decorariuni = new ArrayList<>();
        }
        if(d!=null) {
            this.decorariuni.add(d);
        }
    }

    @Override
    public String toString() {
        return "Magazin [" +
                "podea=" + podea +
                ", denumire='" + denumire +
                ", suprafata=" + suprafata +
                ", nrIntrari=" + nrIntrari +
                ", decorariuni=" + decorariuni +
                ']';
    }
}
