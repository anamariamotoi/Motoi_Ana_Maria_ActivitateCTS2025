package factory_supe;

public class SupaVita implements ISupa{

    @Override
    public void afisare() {
        System.out.println("Aceasta este supa de "+ ETipSupa.VITA);
    }
}
