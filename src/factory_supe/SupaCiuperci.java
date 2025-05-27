package factory_supe;

public class SupaCiuperci implements ISupa{

    @Override
    public void afisare() {
        System.out.println("Aceasta este supa de "+ ETipSupa.CIUPERCI);
    }
}
