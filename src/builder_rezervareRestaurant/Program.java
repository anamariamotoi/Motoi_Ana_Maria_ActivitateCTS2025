package builder_rezervareRestaurant;

public class Program {
    public static void main(String[] args) throws Exception {
        RezervareBuilder builder = new RezervareBuilder();
        Rezervare rezervare1 = builder.setAsezareGeam(true).setDecorMasa(false).setScauneErgonomice(true).setMuzicaAmbientalaPersonalizata(true).build();

        System.out.println(rezervare1);
        Rezervare rezervare2 = builder.setAsezareGeam(true).setDecorMasa(false).setScauneErgonomice(true).setMuzicaAmbientalaPersonalizata(true).setGenMuzica("pop").build();
        System.out.println(rezervare2);


    }
}
