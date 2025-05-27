package singleton.restaurant_ospatar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Restaurant {
    private static final Restaurant instance = new Restaurant(10);
    private List<Masa> mese;
    private List<Ospatar> ospatari;

    private Restaurant(int nrMese) {
        this.mese = new ArrayList<>();
        for(int i=0; i<nrMese; i++){
            this.mese.add(new Masa(i));
        }
        this.ospatari = new ArrayList<>();
    }

    //eager initialization
    public static Restaurant getInstance(){
        return instance;
    }



    @Override
    public String toString() {
        return "Restaurant{" +
                "mese=" + mese +
                ", ospatari=" + ospatari +
                '}';
    }
}