package prototypeFactory.prototypefactory;

import java.util.ArrayList;

public class JucatorHandbal extends AJucator{
    public JucatorHandbal() {
        this.tip = "handbal";
        listaAntrenamente = new ArrayList<>();
        listaAntrenamente.add("antrenament handbal1");
        listaAntrenamente.add("antrenament handbal2");
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
