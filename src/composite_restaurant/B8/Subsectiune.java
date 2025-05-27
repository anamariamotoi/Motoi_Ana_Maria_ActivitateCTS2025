package composite_restaurant.B8;

import java.util.ArrayList;
import java.util.List;

public class Subsectiune extends AMeniu{
    private String denumire;
    private List<AMeniu> listaItems;

    public Subsectiune(String denumire) {
        this.denumire = denumire;
        this.listaItems = new ArrayList<>();
    }

    @Override
    public void afisareMeniu() {
        System.out.println("Subsectiunea: " + this.denumire);
        if(listaItems!=null){
            for(AMeniu item : listaItems){
                item.afisareMeniu();
            }
        }
    }

    @Override
    public void adauga(AMeniu copil) {
        if(copil!=null){
            listaItems.add(copil);
        }
    }

    @Override
    public void sterge(AMeniu copil) {
        if(copil!=null){
            listaItems.remove(copil);
        }
    }

    @Override
    public AMeniu extrage(int index) {
        if(listaItems!=null && index>=0 && index < listaItems.size()){
            System.out.println("Item-ul de la indexul " + index + ": ");
            return listaItems.get(index);
        }
        return null;
    }
}
