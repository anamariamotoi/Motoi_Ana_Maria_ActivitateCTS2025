package prototypeFactory.prototypefactory;

import java.util.ArrayList;

public class JucatorFotbal extends AJucator{

    public JucatorFotbal() {
        System.out.println("Incarcare");
        this.tip = "fotbal";
        listaAntrenamente = new ArrayList<>();
        listaAntrenamente.add("antrenament fotabal1");
        listaAntrenamente.add("antrenament fotabal2");

    }

    @Override
    void afisare() {
        System.out.println("Acesta este un jucator de " + this.tip);
    }

    @Override
    protected AJucator clone() {
        AJucator clone = super.clone();
        clone.listaAntrenamente = new ArrayList<>();
        for(int i=0; i<listaAntrenamente.size(); i++ ){
            clone.listaAntrenamente.add(this.listaAntrenamente.get(i));
        }
        return clone;
    }
}
