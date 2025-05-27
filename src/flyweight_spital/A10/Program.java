package flyweight_spital.A10;

public class Program {
    public static void main(String[] args) {

        Pacient p1 = PacientFactory.getPacient("Ion Popescu", "0711111111", "Str. Lalelelor 10");

        Salon s1 = new Salon(1, 2, 5, p1);

        p1.afisareDetaliiPersonale();
        System.out.println(PacientFactory.getNrPacienti());
    }

}
