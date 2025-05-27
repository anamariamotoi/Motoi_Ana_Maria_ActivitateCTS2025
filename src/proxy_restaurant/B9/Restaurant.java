package proxy_restaurant.B9;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements IRestaurant{
    private String nume;
    private List<Client> listaRezervari;


    public Restaurant(String nume) {
        this.nume = nume;
        this.listaRezervari = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    @Override
    public void rezervaMasa(Client client) {
        if(client!=null){
            listaRezervari.add(client);
        }
    }

    @Override
    public void afisareRezervari() {
        System.out.println("Rezervari restaurant " + this.nume + ": ");
        if(listaRezervari!=null){
            for(Client c : listaRezervari){
                System.out.println(c);
            }
        }
    }
}
