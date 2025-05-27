package builder_magazin;

import java.util.ArrayList;
import java.util.List;

public class MagazinBuilder implements IBuilder {
    private IPodea podea;
    private String denumire;
    private float suprafata;
    private int nrIntrari;
    private List<IDecoratiune> decorariuni = null;

    public MagazinBuilder(String denumire, int nrIntrari, float suprafata) {

        this.denumire = denumire;
        this.nrIntrari = nrIntrari;
        this.suprafata = suprafata;
        this.decorariuni = new ArrayList<>();
    }

    public MagazinBuilder setPodea(IPodea podea) {
        this.podea = podea;
        return this;
    }

    public MagazinBuilder setDecorariuni(IDecoratiune decorariuni) {
       if(decorariuni!=null){
           this.decorariuni.add(decorariuni);
       }
        return this;
    }

    @Override
    public Magazin build() throws Exception {
        Magazin m = null;
        if(this.suprafata/100>this.nrIntrari){
            throw new Exception("nu pot exista mai puțin de 1 intrări per 100 mp de magazin");
        }
        if(this.podea==null){
            this.podea = new PodeaCiment();
        }
        if(this.podea.getDuritate()<2){
            for(IDecoratiune d: this.decorariuni){
                if(d.getMaterial() == ETipMaterial.STICLA){
                    throw new Exception("Nu se permit decoratiuni de sticla deoarece duritatea podelei este mica");
                }
            }
        }
        m = new Magazin(podea, denumire, suprafata, nrIntrari);
        for(IDecoratiune d: this.decorariuni){
            m.addDecoratiune(d);
        }
        return m;
    }
}
