package builder_magazin;

public class Program {
    public static void main(String[] args) {
        MagazinBuilder builder = new MagazinBuilder("Zara", 2, 150);
        Magazin magazin1 = null;
        try {
            magazin1 = builder.build();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(magazin1);

        IDecoratiune decoratiune1 = new Decoratiune(ETipMaterial.LEMN, "Scaun");
        magazin1.addDecoratiune(decoratiune1);
        System.out.println(magazin1);

        IPodea podea = new PodeaLemn(1);
        Magazin magazin2 = null;

        IDecoratiune decoratiune2 = new Decoratiune(ETipMaterial.STICLA, "Vaza");

        try {
            magazin2 = builder.setPodea(podea).setDecorariuni(decoratiune2).build();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(magazin2);

    }
}
