package composite_restaurant.B8;

import java.util.ArrayList;
import java.util.List;

public class Sectiune extends AMeniu{
    private String denumire;
    private List<AMeniu> listaCopii;


    public Sectiune(String denumire) {
        this.denumire = denumire;
        this.listaCopii = new ArrayList<>();
    }

    public String getDenumire() {
        return denumire;
    }

    @Override
    public void afisareMeniu() {
        System.out.println("Sectiunea: " + this.denumire);
        if(listaCopii!=null){
            for(AMeniu copil : listaCopii){
                copil.afisareMeniu();
            }
        }
    }

    @Override
    public void adauga(AMeniu copil) {
        if(copil!=null){
            listaCopii.add(copil);
        }
    }

    @Override
    public void sterge(AMeniu copil) {
        if(copil!=null){
            listaCopii.remove(copil);
        }
    }

    @Override
    public AMeniu extrage(int index) {
        if(listaCopii!=null && index>=0 && index< listaCopii.size()){
            return listaCopii.get(index);
        }
        return null;
    }
}
