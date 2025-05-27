package facade_restaurant.B6;

public class Program {
    public static void main(String[] args) {
        Masa masa = new Masa(1, 2, false, false);
        Masa masa2 = new Masa(2, 4, true,true);
        System.out.println(Facade.poateFiOcupata(masa, new Servetele(masa), new Debarasare(masa)));
        System.out.println(Facade.poateFiOcupata(masa2, new Servetele(masa2), new Debarasare(masa2)));

    }
}
