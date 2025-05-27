package decorator_restaurant.B7;

public class DecoratorMesajAnNou extends ADecoratorNota{

    public DecoratorMesajAnNou(ANotaDePlata notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printareNota() {
        super.printareNota();
        System.out.println("La multi ani!");
    }
}
