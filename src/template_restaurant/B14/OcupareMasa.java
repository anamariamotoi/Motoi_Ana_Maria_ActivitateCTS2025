package template_restaurant.B14;

public class OcupareMasa extends AOcupareMasa{
    @Override
    public void curatareMasa() {
        System.out.println("Se curata masa");
    }

    @Override
    public void asezareServetele() {
        System.out.println("Se aseaza servetele pe masa");
    }

    @Override
    public void asezareTacamuri() {
        System.out.println("Se aseaza tacamuri pe masa");
    }

    @Override
    public void invitarePersoane() {
        System.out.println("Se invita persoanele pentru a servi masa");
    }
}
