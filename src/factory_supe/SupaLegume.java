package factory_supe;

public class SupaLegume implements ISupa{

    @Override
    public void afisare() {
        System.out.println("Aceasta este supa de "+ ETipSupa.LEGUME);
    }
}
