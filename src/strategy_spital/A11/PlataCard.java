package strategy_spital.A11;

public class PlataCard implements IPlata{
    @Override
    public void plateste(float totalPlata) {
        System.out.println("Mod de plata: card. Suma: " + totalPlata);
    }
}
