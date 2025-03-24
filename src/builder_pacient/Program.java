package builder_pacient;

public class Program {

    public static void main(String[] args) {
        PacientBuilder builder = new PacientBuilder();
        Pacient pacient = builder.setPatRabatabil(false).setMicDejun(true).setPapuciCamera(true).build();
        System.out.println(pacient);

        Pacient pacient2 = builder.setPatRabatabil(true).setPapuciCamera(true).setMicDejun(true).setHalatInterior(true).build();
        Pacient pacient3 = builder.setPatRabatabil(true).setPapuciCamera(true).setMicDejun(false).setHalatInterior(true).build();
        Pacient pacient4 = builder.setPatRabatabil(false).setPapuciCamera(false).setMicDejun(true).setHalatInterior(true).build();
        Pacient pacient5 = builder.build();

        System.out.println(pacient2);
        System.out.println(pacient3);
        System.out.println(pacient4);
        System.out.println(pacient5);


    }

}
