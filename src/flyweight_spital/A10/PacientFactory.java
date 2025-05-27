package flyweight_spital.A10;

import java.util.HashMap;

public class PacientFactory {
    private static HashMap<String, Pacient> pacienti = new HashMap<>();
    private static int nrPacienti= 0;

    public static Pacient getPacient(String nume, String telefon, String adresa){
        nrPacienti++;
        Pacient pacient = pacienti.get(nume);
        if (pacient==null) {
            pacient = new Pacient(nume, telefon,adresa);
            pacienti.put(nume, pacient);
        }
        return pacient;
    }

    public static int getNrPacienti(){
        return nrPacienti;
    }

}
