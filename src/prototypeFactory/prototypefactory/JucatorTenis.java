package prototypeFactory.prototypefactory;

import java.util.ArrayList;

public class JucatorTenis extends AJucator{

    public JucatorTenis() {
        this.tip = "tenis";
        listaAntrenamente = new ArrayList<>();
        listaAntrenamente.add("antrenament tenis1");
        listaAntrenamente.add("antrenament tenis2");
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
