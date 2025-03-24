package factory_personalSpital;

public class Program {
    public static void main(String[] args) {
        PersonalSpitalFactory personalSpitalFactory = new PersonalSpitalFactory();
        iPersonalSpital personalSpital = null;

        try {
            personalSpital = personalSpitalFactory.crearePersonal(EPersonalSpital.ASISTENT);
        } catch (Exception e) {
            e.printStackTrace();
        }


        personalSpital.afisare();
    }

}
