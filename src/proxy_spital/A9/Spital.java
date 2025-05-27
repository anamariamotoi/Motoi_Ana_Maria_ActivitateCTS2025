package proxy_spital.A9;

import java.util.ArrayList;
import java.util.List;

public class Spital implements ISpital{
    private String denumireSpital;
    private List<Pacient> listaPacienti;

    public Spital(String denumireSpital) {
        this.denumireSpital = denumireSpital;
        this.listaPacienti = new ArrayList<>();
    }

    public String getDenumireSpital() {
        return denumireSpital;
    }


    @Override
    public void internarePacient(Pacient p) {
        if(p!=null){
            listaPacienti.add(p);
            System.out.println("Pacientul " + p + "a fost internat");
        }
    }

    @Override
    public void afisarePacienti() {

    }
}
