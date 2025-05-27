package facade_restaurant.B6;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class Facade {
    public static boolean verificareDisponibilitateMasa(Masa masa){
        if(masa.verificareDisponibilitate()) {
            System.out.println("Masa este disponibila");
            return true;
        }else{
            System.out.println("Masa este ocupata");
        }
        return false;
    }

    public static boolean verificaServetele(Servetele servetele, Masa masa){
        if(servetele.areServetele(masa)){
            System.out.println("Pe masa sunt servetele");
            return true;
        }else{
            System.out.println("Trebuiesc puse servetele noi pe masa");
        }
        return false;
    }

    public static boolean verificaDebarasare(Debarasare debarasare, Masa masa){
        if(debarasare.esteDebarasata(masa)){
            System.out.println("Masa este debarasata");
            return true;
        }else{
            System.out.println("Masa trebuie debarasata");
        }
        return false;
    }

    public static boolean poateFiOcupata(Masa masa, Servetele servetele, Debarasare debarasare) {
        boolean libera = verificareDisponibilitateMasa(masa);
        boolean areServetele = verificaServetele(servetele, masa);
        boolean debarasata = verificaDebarasare(debarasare, masa);

        return libera && areServetele && debarasata;
    }
}
