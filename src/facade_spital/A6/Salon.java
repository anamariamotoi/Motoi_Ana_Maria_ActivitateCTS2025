package facade_spital.A6;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private List<Boolean> listaPaturiDisponibile;
    private int nrPaturi;


    public Salon(int nrPaturi) {
        this.nrPaturi = nrPaturi;
        this.listaPaturiDisponibile = new ArrayList<>();
        for (int i = 0; i < nrPaturi; i++) {
            listaPaturiDisponibile.add(true);
        }
    }

    public boolean patDisponibil(){
        return listaPaturiDisponibile.contains(true);
    }

    public void adaugaPat(){
        listaPaturiDisponibile.add(true);
    }

    public void ocupaPat(int index){
        if(listaPaturiDisponibile.get(index) == true){
           listaPaturiDisponibile.set(index, false);
           System.out.println("PatuL " + index + " a fost ocupat");
        }else{
            System.out.println("Patul " + index + " este ocupat. Alegeti alt pat." );
        }
    }

    public void elibereazaPat(int index){
        if(listaPaturiDisponibile.get(index) == false){
            listaPaturiDisponibile.set(index, true);
            System.out.println("PatuL " + index + "a fost eliberat");
        }else{
            System.out.println("Patul " + index + " este liber." );
        }
    }


}
