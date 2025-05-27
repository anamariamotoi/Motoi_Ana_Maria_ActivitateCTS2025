package template_restaurant.B14;

public abstract class AOcupareMasa {
    public abstract void curatareMasa();
    public abstract void asezareServetele();
    public abstract void asezareTacamuri();
    public abstract void invitarePersoane();

    public final void ocupaMasa(){
        curatareMasa();
        asezareServetele();
        asezareTacamuri();
        invitarePersoane();
    }
}
