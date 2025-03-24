package factory_personalSpital;

public class PersonalSpitalFactory {

    public iPersonalSpital crearePersonal(EPersonalSpital personalSpital) throws Exception{
        switch (personalSpital){
            case BRANCARDIER:
                return new Brancardier();
            case ASISTENT:
                return new Asistent();
            case MEDIC:
                return new Medic();
            default:
                throw new Exception("Nu face parte din personalul spitalului");
        }
    }
}

