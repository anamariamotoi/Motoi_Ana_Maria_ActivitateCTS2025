package composite_spital.A8;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Departament extends ANod{
    private String denumireDepartament;
    private List<ANod> listaCopii;

    public Departament(String denumireDepartament) {
        this.denumireDepartament = denumireDepartament;
        this.listaCopii = new ArrayList<>();
    }

    @Override
    public void afiseazaDetalii() {
        if(listaCopii!=null) {
            System.out.println("Departamentul: " + this.denumireDepartament);
            for (ANod copil : listaCopii) {
                copil.afiseazaDetalii();
            }
        }
    }

    @Override
    public void adauga(ANod copil) {
        if(copil != null){
            listaCopii.add(copil);
        }
    }

    @Override
    public void sterge(ANod copil) {
        if(copil != null){
            listaCopii.remove(copil);
        }
    }

    @Override
    public ANod extrage(int index) {
        if(listaCopii!=null && index >=0 && index < listaCopii.size()){
            return this.listaCopii.get(index);
        }
        return null;
    }
}
