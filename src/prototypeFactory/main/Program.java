package prototypeFactory.main;

import prototypeFactory.prototypefactory.AJucator;
import prototypeFactory.prototypefactory.PrototypeFactory;

public class Program {
    public static void main(String[] args) {
        AJucator jucatorFotabal1 = PrototypeFactory.getPrototipJucator("fotbal");
        if(jucatorFotabal1!=null){
            jucatorFotabal1.setId(1);
            jucatorFotabal1.setNume("Vali");
            System.out.println(jucatorFotabal1);
        }

        AJucator.addMedicament("medicament1");
        AJucator.addMedicament("medicament2");

        System.out.println(jucatorFotabal1);

        AJucator jucatorTenis1 = PrototypeFactory.getPrototipJucator("tenis");
        if(jucatorTenis1!=null){
            jucatorTenis1.setId(2);
            jucatorTenis1.setNume("Bucur");
            System.out.println(jucatorTenis1);
        }
        AJucator.addMedicament("medicament3");
        System.out.println(jucatorTenis1);
    }
}
