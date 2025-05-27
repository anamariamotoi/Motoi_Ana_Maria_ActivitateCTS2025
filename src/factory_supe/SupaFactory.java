package factory_supe;

public class SupaFactory {
    public ISupa creareSupa(ETipSupa tipSupa) throws Exception{
        switch (tipSupa){
            case LEGUME:
                return new SupaLegume();
            case CIUPERCI:
                return new SupaCiuperci();
            case VITA:
                return new SupaVita();
            default:
                throw  new Exception("Tipul de supa nu face parte din meniul restauranului");
        }
    }
}
