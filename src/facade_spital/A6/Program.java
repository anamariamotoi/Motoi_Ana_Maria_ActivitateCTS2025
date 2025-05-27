package facade_spital.A6;

public class Program {
    public static void main(String[] args) {
        Medic medic1 = new Medic();
        Pacient pacient1 = new Pacient("Ana", 4);
        System.out.println(Facade.verificareInternare(medic1, pacient1));
        System.out.println(Facade.verificareDisponibilitatePaturi(30, 2));

    }
}
