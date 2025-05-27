package strategy_spital.A11;

public class PlataCash implements IPlata{

    @Override
    public void plateste(float totalPlata) {
        System.out.println("Mod de plata: cash. Suma: " + totalPlata);
    }
}
