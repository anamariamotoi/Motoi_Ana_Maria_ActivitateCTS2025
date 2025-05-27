package decorator_restaurant.B7;

public class Program {
    public static void main(String[] args) {

        ANotaDePlata notaDePlata1 = new NotaDePlata(100, "01.01.2026", 150);
        ANotaDePlata notaDePlata2 = new NotaDePlata(101, "01.01.2026", 200);
        ANotaDePlata notaDePlata3 = new NotaDePlata(102, "01.01.2026", 350);

        ANotaDePlata notaDecorata1 = new DecoratorMesajAnNou(notaDePlata1);
        ANotaDePlata notaDecorata2 = new DecoratorMesajAnNou(notaDePlata2);
        ANotaDePlata notaDecorata3 = new DecoratorMesajAnNou(notaDePlata3);

        notaDecorata1.printareNota();
        notaDecorata2.printareNota();
        notaDecorata3.printareNota();
    }
}
