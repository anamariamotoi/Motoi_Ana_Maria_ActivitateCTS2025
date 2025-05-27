package factory_supe;

public class Program {
    public static void main(String[] args) {
        SupaFactory supaFactory = new SupaFactory();
        ISupa supa = null;
        try {
            supa = supaFactory.creareSupa(ETipSupa.CIUPERCI);
        } catch (Exception e) {
            e.printStackTrace();
        }

        supa.afisare();
    }
}
