package decorator_restaurant.B7;

public abstract class ADecoratorNota extends ANotaDePlata{
    protected ANotaDePlata notaDePlata;

    public ADecoratorNota(ANotaDePlata notaDePlata) {
        this.notaDePlata = notaDePlata;
    }

    @Override
    public void printareNota() {
        notaDePlata.printareNota();
    }
}
