package prototypeFactory.prototypefactory;

import java.util.ArrayList;
import java.util.List;

public abstract class AJucator implements Cloneable{
    private int id;
    private String nume;
    protected String tip;
    protected List<String> listaAntrenamente;
    private static final List<String> listaMedicamenteInterzise = new ArrayList<>();

    public AJucator() {

    }

    abstract void afisare();

    public int getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public List<String> getListaAntrenamente() {
        return listaAntrenamente;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTip() {
        return tip;
    }

    public List<String> getListaMedicamenteInterzise() {
        return listaMedicamenteInterzise;
    }

    public static void addMedicament(String medicamentNou){
        if(medicamentNou!=null){
            if(!listaMedicamenteInterzise.contains(medicamentNou)){
                listaMedicamenteInterzise.add(medicamentNou);
            }
        }
    }

    @Override
    public String toString() {
        return "AJucator [" + "id=" + id + ", nume='" + nume + ", tip='" + tip + ", listaAntrenamente=" + listaAntrenamente + ",listaMedicamenteInterzise" + listaMedicamenteInterzise + ']';
    }

    @Override
    protected AJucator clone() {
        Object clone = null;
        try{
            clone = super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return (AJucator) clone;
    }
}
