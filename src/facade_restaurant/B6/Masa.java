package facade_restaurant.B6;

public class Masa {
    private int nrMasa;
    private int capacitate;
    private boolean esteOcupata;
    private boolean areServetele;
    private boolean esteDebarasata;

    public Masa(int nrMasa, int capacitate, boolean areServetele, boolean esteDebarasata) {
        this.nrMasa = nrMasa;
        this.capacitate = capacitate;
        this.esteOcupata = false;
        this.areServetele = areServetele;
        this.esteDebarasata = esteDebarasata;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public int getCapacitate() {
        return capacitate;
    }

    public boolean isEsteOcupata() {
        return esteOcupata;
    }

    public boolean isAreServetele() {
        return areServetele;
    }

    public boolean isEsteDebarasata() {
        return esteDebarasata;
    }

    public boolean verificareDisponibilitate(){
        if(this.esteOcupata == false){
            return true;
        }
        return false;
    }
}
