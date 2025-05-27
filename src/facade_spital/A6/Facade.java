package facade_spital.A6;

public class Facade {

    public static boolean verificareInternare(Medic medic, Pacient pacient){
        if(medic.confirmaInternare(pacient)){
            System.out.println("Pacintul trebuie internat");
            return true;
        }
        return false;
    }

    public static boolean verificareDisponibilitatePaturi(int nrPaturi, int indexPat){
        Salon salon = new Salon(nrPaturi);
        int ct = 0;
        for(int i =0; i<nrPaturi; i++){
          if(salon.patDisponibil()){
              ct++;
          }
        }
        if(ct>0 && indexPat>=0){
            salon.ocupaPat(indexPat);
            return true;
        }
        return false;
    }
}
